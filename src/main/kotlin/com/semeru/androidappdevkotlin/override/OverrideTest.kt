package com.semeru.androidappdevkotlin.override

fun main() {

    val vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(70)
    vehicle.stop()

    println("======================")
    val car = Car()

    car.superStart()
    car.superAccelerate()
    car.superStop()

    println("======================")

    car.start()
    car.accelerate(50)
    car.stop()
}