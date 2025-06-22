package com.semeru.androidappdevkotlin.oop

import com.semeru.androidappdevkotlin.classes.Car
import com.semeru.androidappdevkotlin.classes.Motorcycle

fun main() {

    //menciptakan object dari class Car
    val car = Car()
    car.type = "Sedan"
    car.model = "Toyota"
    car.maxSpeed = 200
    car.show()

    //menciptakan object dari class Motorcycle
    val motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Honda"
    motorcycle.maxSpeed = 150
    motorcycle.show()

}