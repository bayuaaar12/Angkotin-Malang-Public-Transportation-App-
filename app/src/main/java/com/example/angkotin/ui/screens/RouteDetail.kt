package com.example.angkotin.ui.screens

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.angkotin.R
import com.example.angkotin.data.RouteEntity
import com.example.angkotin.data.RouteFactory
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.DirectionsApiRequest
import com.google.maps.GeoApiContext
import com.google.maps.android.PolyUtil
import com.google.maps.model.TravelMode
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Routedetailpage(navController: NavController, routeId: String) {
    val context = LocalContext.current
    val route = RouteFactory.getRoute(routeId) // Obtain the route details
    val mapView = remember { MapView(context) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Route Details") },
                navigationIcon = {
                    IconButton(
                        onClick = { (navController.context as? Activity)?.finish() }, // Navigate back
                        modifier = Modifier
                            .padding(5.dp)
                            .size(50.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.Black // Set icon color to black
                        )
                    }
                }
            )
        },
        bottomBar = {
            // Optional back navigation button here if needed
        }
    ) { paddingValues ->

        BottomSheetScaffold(
            sheetContent = {
                StreetNamesBottomSheet(route)
            },
            modifier = Modifier.padding(paddingValues),
            sheetPeekHeight = 64.dp
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                // Fullscreen map
                AndroidView(
                    factory = {
                        mapView.onCreate(null)
                        mapView.onResume()
                        mapView.getMapAsync { googleMap ->
                            setupMap(googleMap, context, route)
                            googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(context, R.raw.map_style))

                        }
                        mapView
                    },
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun StreetNamesBottomSheet(route: RouteEntity?) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)
    ) {
        // Top handle for dragging
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(4.dp)
                .background(Color.Gray, shape = CircleShape)
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 8.dp)
        )

        // Scrollable list of stops
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 8.dp)
        ) {
            if (route != null) {
                items(route.streetNames) { streetName ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(Color(0xFF90CAF9), shape = CircleShape)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = streetName,
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}


fun setupMap(map: GoogleMap, context: Context, route: RouteEntity?) {
    route?.let {
        val start = LatLng(it.origin.latitude, it.origin.longitude)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(start, 12f))
        drawRoute(map, it.id, context) // Draw route based on route ID
    }
}

fun drawRoute(map: GoogleMap?, routeId: String, context: Context) {
    if (map == null) return

    val route = RouteFactory.getRoute(routeId)
    if (route != null) {
        val geoContext = GeoApiContext.Builder()
            .apiKey(context.getString(R.string.google_map_api_key))
            .build()

        val origin = LatLng(route.origin.latitude, route.origin.longitude)
        val destination = LatLng(route.destination.latitude, route.destination.longitude)
        val waypoints = route.waypoints.map { com.google.maps.model.LatLng(it.latitude, it.longitude) }

        map.addMarker(MarkerOptions().position(origin).title("Origin"))
        map.addMarker(MarkerOptions().position(destination).title("Destination"))

        CoroutineScope(Dispatchers.Main).launch {
            try {
                val result = DirectionsApiRequest(geoContext)
                    .origin(com.google.maps.model.LatLng(origin.latitude, origin.longitude))
                    .destination(com.google.maps.model.LatLng(destination.latitude, destination.longitude))
                    .waypoints(*waypoints.toTypedArray())
                    .mode(TravelMode.DRIVING)
                    .await()

                if (result.routes.isNotEmpty()) {
                    val apiRoute = result.routes[0]
                    val encodedPath = apiRoute.overviewPolyline.encodedPath
                    val decodedPath = PolyUtil.decode(encodedPath)

                    val polylineOptions = PolylineOptions()
                        .addAll(decodedPath.map { LatLng(it.latitude, it.longitude) })
                        .width(10f)
                        .color(Color.Blue.hashCode())
                    map.addPolyline(polylineOptions)
                } else {
                    Toast.makeText(context, "No route found", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    } else {
        Toast.makeText(context, "Invalid route ID", Toast.LENGTH_SHORT).show()
    }
}
