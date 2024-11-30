package com.example.angkotin

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DarkModeActivity : AppCompatActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DarkModeSettingsScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DarkModeSettingsScreen() {
    val context = LocalContext.current
    val gradientBackground = Brush.linearGradient(
        colors = listOf(
            Color(0xFF1E88E5).copy(alpha = 0.9f),
            Color(0xFF6AB7FF).copy(alpha = 0.7f)
        )
    )

    // State untuk RadioButton
    val selectedOption = remember { mutableStateOf("Use System Settings") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dark Mode Settings", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        (context as? DarkModeActivity)?.onBackPressed()
                    }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                    scrolledContainerColor = Color(0xFF1E88E5)
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(gradientBackground)
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Text(
                    text = "Dark Mode Options",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                DarkModeOption(
                    title = "Use System Settings",
                    isSelected = selectedOption.value == "Use System Settings",
                    onSelect = { selectedOption.value = "Use System Settings" }
                )
                Divider(color = Color.White.copy(alpha = 0.5f), thickness = 1.dp)
                DarkModeOption(
                    title = "Always On",
                    isSelected = selectedOption.value == "Always On",
                    onSelect = { selectedOption.value = "Always On" }
                )
                Divider(color = Color.White.copy(alpha = 0.5f), thickness = 1.dp)
                DarkModeOption(
                    title = "Always Off",
                    isSelected = selectedOption.value == "Always Off",
                    onSelect = { selectedOption.value = "Always Off" }
                )
            }
        }
    }
}

@Composable
fun DarkModeOption(
    title: String,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )
        RadioButton(
            selected = isSelected,
            onClick = onSelect,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color(0xFF1E88E5),
                unselectedColor = Color.White
            )
        )
    }
}
