package com.example.angkotin.ui.screens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.angkotin.data.RouteFactory
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.angkotin.ListRouteActivity
import com.example.angkotin.RouteDetailActivity
import com.example.angkotin.data.RouteEntity
import androidx.compose.runtime.Composable as composable

@SuppressLint("ComposableNaming")
@composable
fun routelistpage(navController: NavController) {
    val routeIds = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21") // List of available route IDs
    val routes = routeIds.mapNotNull { RouteFactory.getRoute(it) } // Get RouteEntity objects

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

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            itemsIndexed(routes) { index, route -> // Use items(routes.size) to get the index
                RouteItem(route, navController, index) // Access route using index
                if (index < routes.size - 1) { // Add divider if not the last item
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 10.dp), // Add padding
                        thickness = 1.5.dp, // Set divider thickness
                        color = Color.LightGray // Set divider color
                    )
                }
            }
        }
    }
}

@Composable
fun RouteItem(route: RouteEntity, navController: NavController, index: Int) {
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                val routeId = (index + 1).toString() // Route ID based on index
                val intent = Intent(context, RouteDetailActivity::class.java).apply {
                    putExtra("routeId", routeId) // Add routeId as an extra
                }
                context.startActivity(intent) // Navigate with routeId
            }
    ) {
        Image(
            painter = painterResource(id = route.logo),
            contentDescription = "Route Logo",
            modifier = Modifier.size(60.dp) // Reduced icon size by 50%
        )
        Text(
            text = route.routeName,
            color = Color.Black,
            fontSize = 17.sp // Increased font size
        ) // Set font color to black
    }
}