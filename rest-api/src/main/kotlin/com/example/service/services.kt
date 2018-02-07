package com.example.service

import com.example.domain.Geocoder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
data class ServiceA @Inject constructor(@get:Inject private val coder: Geocoder)

@Singleton
data class ServiceB @Inject constructor(@get:Inject private val coder: Geocoder)