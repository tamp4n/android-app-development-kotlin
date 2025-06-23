package com.semeru.androidappdevkotlin.override

open class Vehicle {

    open fun start() {
        println("Starting the vehicle")
    }

    open fun stop() {
        println("Stopping the vehicle")
    }

    open fun accelerate(speed: Int) {
        println("Accelerating the vehicle at $speed")
    }

}