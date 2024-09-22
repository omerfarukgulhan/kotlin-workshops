package com.example.maps

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeoCodingResponse(
    val results: List<GeoCodingResult>
)

data class GeoCodingResult(
    val formatted_address: String
)