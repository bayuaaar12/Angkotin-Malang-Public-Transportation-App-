package com.example.angkotin.ui.screens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.isVisible
import androidx.navigation.NavController
import com.example.angkotin.R
import com.example.angkotin.data.RouteEntity
import com.example.angkotin.data.RouteFactory
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.DirectionsApiRequest
import com.google.maps.GeoApiContext
import com.google.maps.android.PolyUtil
import com.google.maps.android.SphericalUtil
import com.google.maps.model.TravelMode
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@SuppressLint("UseOfNonLambdaOffsetOverload")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Routedetailpage(navController: NavController, routeId: String) {
    val context = LocalContext.current
    val route = RouteFactory.getRoute(routeId) // Obtain the route details
    val mapView = remember { MapView(context) }
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState()
    val logoOffsetX by remember { mutableStateOf((-32).dp) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(), // Make the Box take up full width
                        contentAlignment = Alignment.Center // Align the content in the center
                    ) {
                        // Route Logo
                        if (route != null) {
                            Image(
                                painter = painterResource(id = route.logo), // Replace with actual route logo
                                contentDescription = "Route Logo",
                                modifier = Modifier
                                    .size(70.dp) // Adjust the size of the logo
                                    .padding(end = 0.dp)
                                    .offset(x = logoOffsetX)// Add padding to the right of the logo
                            )
                        }
                    }

                },
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
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White // Custom top bar background color
                )
            )
        }
    ) { paddingValues ->
        BottomSheetScaffold(
            scaffoldState = bottomSheetScaffoldState,
            sheetContent = {
                StreetNamesBottomSheet(route) // No extra drag bar here
            },
            sheetPeekHeight = 64.dp, // Minimum height when collapsed
            modifier = Modifier.padding(paddingValues)
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
            .heightIn(max = 450.dp)
    ) {
        // Scrollable list of stops
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
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
                                .background(Color(0xFF1E88E5), shape = CircleShape)
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
                        .color(0xFF1E88E5.toInt())
                    map.addPolyline(polylineOptions)
                    val arrowMarkers = addArrowsToPolyline(map, decodedPath, 700, context) // Adjust arrow spacing as needed
                    // Add camera listener to control arrow visibility
                    map.setOnCameraIdleListener {
                        val currentZoom = map.cameraPosition.zoom
                        val arrowVisibility = currentZoom >= 13 // Adjust zoom threshold as needed

                        arrowMarkers.forEach { marker ->
                            marker.isVisible = arrowVisibility
                        }
                    }
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

fun addArrowsToPolyline(map: GoogleMap, points: List<LatLng>, spacing: Int, context: Context): MutableList<Marker> {    var currentDistance = 0.0
    val arrowMarkers = mutableListOf<Marker>()
    for (i in 0 until points.size - 1) {
        val p1 = points[i]
        val p2 = points[i + 1]
        val segmentDistance = SphericalUtil.computeDistanceBetween(p1, p2)
        currentDistance += segmentDistance


        if (currentDistance >= spacing) {
            currentDistance = 0.0 // Reset distance for next arrow

            // Calculate arrow position (midpoint of segment)
            val arrowPosition = SphericalUtil.interpolate(p1, p2, 0.5)

            // Calculate arrow heading (bearing from p1 to p2)
            val heading = SphericalUtil.computeHeading(p1, p2)

            val arrowIcon = BitmapDescriptorFactory.fromResource(R.drawable.arrow_icon)
            val drawable = ContextCompat.getDrawable(context, R.drawable.arrow_icon)
            if (drawable != null) {
                val bitmap = drawable.toBitmap(50, 50) // Scale the bitmap here

                val scaledIcon = BitmapDescriptorFactory.fromBitmap(bitmap)

                // Add arrow marker
                val marker = map.addMarker(
                    MarkerOptions()
                        .position(arrowPosition)
                        .icon(scaledIcon)
                        .rotation(heading.toFloat())
                        .anchor(0.5f, 0.5f)
                        .flat(true)
                )
                if (marker != null) { // Check if marker was added successfully
                    arrowMarkers.add(marker)
                } // Add each marker to the list
            } else {
                // Handle the case where the bitmap is null (e.g., log an error)
                Log.e("addArrowsToPolyline", "Failed to convert arrow icon to bitmap")
            }
        }
    }
    return arrowMarkers // Return the list of arrow markers
}
