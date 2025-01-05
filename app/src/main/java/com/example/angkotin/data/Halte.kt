package com.example.angkotin.data

import com.google.android.gms.maps.model.LatLng

// Data class for Halte
data class Halte(
    val Coordinate: String = "",
    val ID: String = "",
    val Jalan: String = ""
) {
    // Parse the coordinate string into a LatLng object
    fun getLatLng(): LatLng? {
        return try {
            val regex = """\((-?\d+\.\d+), (-?\d+\.\d+)\)""".toRegex()
            val matchResult = regex.find(Coordinate)
            matchResult?.let {
                val latitude = it.groupValues[1].toDouble()
                val longitude = it.groupValues[2].toDouble()
                LatLng(latitude, longitude)
            }
        } catch (e: Exception) {
            null // Return null if the coordinate string is malformed
        }
    }
}