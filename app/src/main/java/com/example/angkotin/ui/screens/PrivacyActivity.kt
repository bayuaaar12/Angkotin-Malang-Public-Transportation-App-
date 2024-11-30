package com.example.angkotin

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PrivacyActivity : AppCompatActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrivacySettingsScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivacySettingsScreen() {
    val context = LocalContext.current
    val gradientBackground = Brush.linearGradient(
        colors = listOf(
            Color(0xFF1E88E5).copy(alpha = 0.9f),
            Color(0xFF6AB7FF).copy(alpha = 0.7f)
        )
    )

    // State untuk Switch
    val locationDataEnabled = remember { mutableStateOf(true) }
    val personalizedAdsEnabled = remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Privacy", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        (context as? PrivacyActivity)?.onBackPressed()
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
                    text = "Privacy Preferences",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                PrivacyToggle(
                    title = "Location Data",
                    subtitle = "We can help you by suggesting the best lines and routes & notify you about disruptions affecting your journey. If you value this personalized service from us, allow this app to use your device's location even when not using the app.",
                    enabled = locationDataEnabled.value,
                    onToggle = { locationDataEnabled.value = it }
                )
                Divider(color = Color.White.copy(alpha = 0.5f), thickness = 1.dp)
                PrivacyToggle(
                    title = "Personalized Ads",
                    subtitle = "Our partners may use your data to show ads relevant to you on this app and other apps and websites. Opting out means you'll still see ads, but they may not be relevant to your interests.",
                    enabled = personalizedAdsEnabled.value,
                    onToggle = { personalizedAdsEnabled.value = it }
                )
                Divider(color = Color.White.copy(alpha = 0.5f), thickness = 1.dp)
            }
        }
    }
}

@Composable
fun PrivacyToggle(
    title: String,
    subtitle: String,
    enabled: Boolean,
    onToggle: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
            Text(
                text = subtitle,
                fontSize = 14.sp,
                color = Color.White.copy(alpha = 0.7f)
            )
        }
        Switch(
            checked = enabled,
            onCheckedChange = onToggle,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color(0xFF1E88E5),
                uncheckedThumbColor = Color.White
            )
        )
    }
}
