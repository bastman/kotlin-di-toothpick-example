package com.example.domain


data class GeoCoordinates(val lat: Double, val lng: Double)
interface Geocoder {
    fun geocode(address: String): GeoCoordinates
}

class SimpleGeocoder() : Geocoder {
    override fun geocode(address: String): GeoCoordinates {
        return GeoCoordinates(lat = 1.0, lng = 1.1)
    }
}