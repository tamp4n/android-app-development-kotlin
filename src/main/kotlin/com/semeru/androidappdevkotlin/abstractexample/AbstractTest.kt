package com.semeru.androidappdevkotlin.abstractexample

import com.semeru.androidappdevkotlin.abstractexample.Car

fun main() {

    //var vehicle = Vehicle()
    val car = Car(2022)
    car.speed = 100
    println(
        "Car name: ${car.vehicleName("Ferrari")} " +
                "\n Car type: ${car.vehicleType("Sedan")} " +
                "\n Car speed: ${car.speed} " +
                "\n Car model ${car.model}"
    )

}