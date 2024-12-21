package com.example.angkotin.ui.screens

import android.annotation.SuppressLint
import com.example.angkotin.data.RouteEntity
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
import androidx.compose.runtime.Composable as composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.angkotin.R
import com.google.firebase.firestore.FirebaseFirestore



import com.google.firebase.firestore.ktx.toObject

data class Jalur(
    val ID_Rute: String = "",
    val List_ID_Jalan: String = "",
    val Nama_Rute: String = ""
)

fun getJalurData() {
    val db = FirebaseFirestore.getInstance()
    val jalurCollection = db.collection("Jalur")

    jalurCollection.get()
        .addOnSuccessListener { documents ->
            for (document in documents) {
                val jalur = document.toObject<Jalur>()
                println("ID Rute: ${jalur.ID_Rute}")
                println("List ID Jalan: ${jalur.List_ID_Jalan}")
                println("Nama Rute: ${jalur.Nama_Rute}")
            }
        }
        .addOnFailureListener { exception ->
            println("Error getting documents: $exception")
        }
}

