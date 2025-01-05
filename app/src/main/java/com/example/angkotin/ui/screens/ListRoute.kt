package com.example.angkotin.ui.screens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.angkotin.RouteDetailActivity
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.angkotin.data.FirestoreRepository.getJalurData
import com.example.angkotin.data.Jalur

@SuppressLint("ComposableNaming")
@Composable
fun routelistpage(navController: NavController) {
    // State for holding routes fetched from Firestore
    val routesState = remember { mutableStateOf<List<Jalur>>(emptyList()) }

    // Fetch data from Firestore
    LaunchedEffect(Unit) {
        getJalurData { routes ->
            routesState.value = routes // Directly assign the fetched list
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // Set background color to white
    ) {
        // Back button
        IconButton(
            onClick = { (navController.context as? Activity)?.finish() }, // Navigate back
            modifier = Modifier
                .padding(5.dp)
                .size(50.dp) // Adjust size as needed
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black // Set icon color to black
            )
        }

        // Check if routes data is loaded
        if (routesState.value.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = Color.Black)
            }
        } else {
            LazyColumn(
                contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(routesState.value) { route ->
                    RouteItem(route, navController)
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 10.dp),
                        thickness = 1.5.dp,
                        color = Color.LightGray
                    )
                }
            }
        }
    }
}

@Composable
fun RouteItem(route: Jalur, navController: NavController) {
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                val intent = Intent(context, RouteDetailActivity::class.java).apply {
                    putExtra("routeId", route.ID_Rute) // Pass route ID as an extra
                }
                context.startActivity(intent)
            }
    ) {
        val logoResourceId = remember(route.Nama_Rute) {
            context.resources.getIdentifier(route.Nama_Rute.lowercase(), "drawable", context.packageName)
        }
        Image(
            painter = painterResource(id = if (logoResourceId != 0) logoResourceId else android.R.drawable.ic_menu_help),// Update this logic if logos are dynamic
            contentDescription = "Route Logo",
            modifier = Modifier.size(60.dp)
        )
        Text(
            text = route.Deskripsi_Rute,
            color = Color.Black,
            fontSize = 17.sp
        )
    }
}