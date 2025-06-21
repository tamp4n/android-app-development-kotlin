package com.semeru.androidappdevkotlin.oop

import com.semeru.androidappdevkotlin.classes.Cars
import com.semeru.androidappdevkotlin.classes.MyCars

fun main() {

    val myCar = Cars()
    myCar.name = "Toyota"
    myCar.model = 2021
    println("My first car is ${myCar.name} and model is ${myCar.model}")

    val yourCar = Cars()
    yourCar.name = "Honda"
    yourCar.model = 2022
    println("Your first car is ${yourCar.name} and model is ${yourCar.model}")

    val myNewCar = MyCars("Mitsubishi", 2020)
    //println("My new car is ${myNewCar.name} and model is ${myNewCar.model}")

}