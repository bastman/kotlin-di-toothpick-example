package com.example.controller


import com.example.domain.Geocoder
import com.example.service.ServiceA
import com.example.service.ServiceB
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
data class ControllerA @Inject constructor(
        @get:Inject private val coderA: Geocoder,
        @get:Inject private val coderB: Geocoder,
        @get:Inject private val serviceA1: ServiceA,
        @get:Inject private val serviceA2: ServiceA,
        @get:Inject private val serviceB1: ServiceB,
        @get:Inject private val serviceB2: ServiceB
)
@Singleton
data class ControllerB @Inject constructor(
        @get:Inject private val coderA: Geocoder,
        @get:Inject private val coderB: Geocoder,
        @get:Inject private val serviceA1: ServiceA,
        @get:Inject private val serviceA2: ServiceA,
        @get:Inject private val serviceB1: ServiceB,
        @get:Inject private val serviceB2: ServiceB
)