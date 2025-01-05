    package com.example.angkotin.data

import androidx.room.*

@Entity(tableName = "routes")
data class RouteEntity(
    @PrimaryKey val id: String,
    val routeName: String, // Add a name for the route

    // List of street names on the route, converted to string
    val streetNames: List<String>,

    val logo: Int,

    // Origin and Destination as Coordinate data classes
    @Embedded(prefix = "origin_")
    val origin: CoordinatesEntity,

    @Embedded(prefix = "destination_")
    val destination: CoordinatesEntity,

    // Waypoints list with TypeConverter
    val waypoints: List<CoordinatesEntity>
)

data class CoordinatesEntity(
    val latitude: Double,
    val longitude: Double
)

class CoordinatesListConverter {

    // Convert List<CoordinatesEntity> to a single string
    @TypeConverter
    fun fromCoordinatesList(coordinates: List<CoordinatesEntity>): String {
        return coordinates.joinToString(";") { "${it.latitude},${it.longitude}" }
    }

    // Convert string back to List<CoordinatesEntity>
    @TypeConverter
    fun toCoordinatesList(data: String): List<CoordinatesEntity> {
        return data.split(";").map { coord ->
            val (latitude, longitude) = coord.split(",").map { it.toDouble() }
            CoordinatesEntity(latitude, longitude)
        }
    }
}

class StringListConverter {

    @TypeConverter
    fun fromStringList(strings: List<String>): String {
        return strings.joinToString(";")
    }

    @TypeConverter
    fun toStringList(data: String): List<String> {
        return data.split(";")
    }
}