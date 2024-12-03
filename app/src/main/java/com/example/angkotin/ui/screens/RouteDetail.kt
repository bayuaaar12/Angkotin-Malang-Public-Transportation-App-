package com.example.angkotin.ui.screens

import android.app.Activity
import com.google.maps.android.SphericalUtil
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
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
    val route = RouteFactory.getRoute(routeId) // Dapatkan detail rute
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
        // Handle atas untuk drag
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(4.dp)
                .background(Color.Gray, shape = CircleShape)
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 8.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            if (route?.streetNames != null) {
                itemsIndexed(route.streetNames) { index, streetName ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 0.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            // Garis vertikal (atas dan bawah)
                            if (index > 0) {
                                Box(
                                    modifier = Modifier
                                        .width(5.dp)
                                        .height(50.dp)
                                        .align(Alignment.TopCenter)
                                        .background(Color(0xFF90CAF9))
                                )
                            }
                            if (index < route.streetNames.size - 1) {
                                Box(
                                    modifier = Modifier
                                        .width(5.dp)
                                        .height(50.dp)
                                        .align(Alignment.BottomCenter)
                                        .background(Color(0xFF90CAF9))
                                )
                            }

                            // Lingkaran indikator
                            Box(
                                modifier = Modifier
                                    .size(15.dp)
                                    .background(Color.Black, shape = CircleShape)
                                    .align(Alignment.Center)
                            )
                        }

                        Spacer(modifier = Modifier.width(16.dp)) // Jarak antara lingkaran dan teks

                        // Nama jalan
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
        val end = LatLng(it.destination.latitude, it.destination.longitude)

        // Geser kamera ke titik awal
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(start, 12f))

        // Tambahkan marker khusus untuk titik awal dan akhir
        val startIcon = resizeBitmap(context, R.drawable.ic_start, 100, 100) // Ganti dengan ikon titik awal
        val endIcon = resizeBitmap(context, R.drawable.ic_end, 100, 100) // Ganti dengan ikon titik akhir

        map.addMarker(
            MarkerOptions().position(start).icon(startIcon).title("Starting Point")
        )
        map.addMarker(
            MarkerOptions().position(end).icon(endIcon).title("End Point")
        )

        // Tambahkan ikon bus untuk interval tertentu
        val busIcon = resizeBitmap(context, R.drawable.bus, 100, 100) // Ikon bus
        val arrowIcon = resizeBitmap(context, R.drawable.ic_arrow, 35, 35) // Ikon panah

        drawRouteWithArrowsAndBusMarkers(map, context, route, arrowIcon, busIcon)
    }
}

fun resizeBitmap(context: Context, resourceId: Int, width: Int, height: Int): BitmapDescriptor {
    val bitmap = BitmapFactory.decodeResource(context.resources, resourceId)
    val resizedBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false)
    return BitmapDescriptorFactory.fromBitmap(resizedBitmap)
}

fun drawRouteWithArrowsAndBusMarkers(
    map: GoogleMap,
    context: Context,
    route: RouteEntity,
    arrowIcon: BitmapDescriptor,
    busIcon: BitmapDescriptor
) {
    val geoContext = GeoApiContext.Builder()
        .apiKey(context.getString(R.string.google_map_api_key))
        .build()

    val origin = LatLng(route.origin.latitude, route.origin.longitude)
    val destination = LatLng(route.destination.latitude, route.destination.longitude)
    val waypoints = route.waypoints.map { com.google.maps.model.LatLng(it.latitude, it.longitude) }

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
                val decodedPath = PolyUtil.decode(apiRoute.overviewPolyline.encodedPath)

                // Tambahkan Polyline
                val polylineOptions = PolylineOptions()
                    .addAll(decodedPath.map { LatLng(it.latitude, it.longitude) })
                    .width(10f)
                    .color(Color.Blue.hashCode()) // Ubah menjadi Color.Blue
                map.addPolyline(polylineOptions)

                // Interval panah dan bus
                val arrowInterval = 5 // Tambah panah setiap 5 segmen
                val busInterval = 15 // Tambah logo bus setiap 15 segmen

                for (i in 0 until decodedPath.size - 1) {
                    val startPoint = LatLng(decodedPath[i].latitude, decodedPath[i].longitude)
                    val endPoint = LatLng(decodedPath[i + 1].latitude, decodedPath[i + 1].longitude)
                    val bearing = SphericalUtil.computeHeading(startPoint, endPoint).toFloat()

                    // Tambah panah di interval tertentu
                    if (i % arrowInterval == 0) {
                        map.addMarker(
                            MarkerOptions()
                                .position(startPoint)
                                .icon(arrowIcon)
                                .rotation(bearing)
                                .anchor(0.5f, 0.5f)
                        )
                    }

                    // Tambah logo bus di interval tertentu
                    if (i % busInterval == 0) {
                        map.addMarker(
                            MarkerOptions()
                                .position(startPoint)
                                .icon(busIcon)
                                .anchor(0.5f, 0.5f)
                        )
                    }
                }
            } else {
                Toast.makeText(context, "No route found", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}



