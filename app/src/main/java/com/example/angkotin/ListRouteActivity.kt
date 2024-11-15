package com.example.angkotin

import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.compose.rememberNavController
import com.example.angkotin.ui.screens.routelistpage


class ListRouteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContent {
            val navController = rememberNavController()
            routelistpage(navController = navController)
        }
    }
}