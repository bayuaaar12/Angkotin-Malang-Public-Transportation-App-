package com.example.angkotin

import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.compose.rememberNavController
import com.example.angkotin.ui.screens.Routedetailpage


class RouteDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContent {
            val navController = rememberNavController()
            val routeId = intent.getStringExtra("routeId") ?: "" // Retrieve routeId from Intent extras
            Routedetailpage(navController = navController, routeId = routeId)
        }
    }
}