package com.semeru.androidappdevkotlin.override

class Car : Vehicle() {

    fun superStart() {
        super.start()
    }

    fun superStop() {
        super.stop()
    }

    fun superAccelerate() {
        super.accelerate(75)
    }

    override fun start() {
        println("Starting the car")
    }

    override fun stop() {
        println("Stopping the car")
    }

    override fun accelerate(speed: Int) {
        println("Accelerating the car at $speed")
    }
}