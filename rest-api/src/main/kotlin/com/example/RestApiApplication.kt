package com.example

import com.example.controller.ControllerA
import com.example.controller.ControllerB
import com.example.domain.Geocoder
import com.example.domain.SimpleGeocoder
import mu.KLogging
import toothpick.Toothpick
import toothpick.Toothpick.setConfiguration
import toothpick.configuration.Configuration.forProduction
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator
import tv.sporttotal.toothpick.kotlin.bindInstance
import tv.sporttotal.toothpick.kotlin.simpleScope


class RestApiApplication() {

    fun run() {
        logger.info { "==== App.run ===" }

        val configuration = forProduction()//if (BuildConfig.DEBUG) forDevelopment() else forProduction()
        setConfiguration(configuration.disableReflection())
        FactoryRegistryLocator.setRootRegistry(FactoryRegistry())
        MemberInjectorRegistryLocator.setRootRegistry(MemberInjectorRegistry())

        val scope = simpleScope(this, {
            bindInstance<Geocoder> { SimpleGeocoder() }
        })

        Toothpick.inject(this, scope);

        println("this=$this")

        val controllerA = scope.getInstance(ControllerA::class.java)
        println("controllerA=$controllerA")

        val controllerB = scope.getInstance(ControllerB::class.java)
        println("controllerB=$controllerB")
    }

    companion object : KLogging()
}

fun main(args: Array<String>) {
    RestApiApplication().run()
}