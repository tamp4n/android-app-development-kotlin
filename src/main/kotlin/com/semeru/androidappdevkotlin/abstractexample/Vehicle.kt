package com.semeru.androidappdevkotlin.abstractexample

abstract class Vehicle {

    // abstract method
    abstract fun vehicleName(name: String): String

    // non-abstract method
    fun vehicleType(type: String): String {
        return type
    }

    //abstract property
    abstract val model: Int

    //non-abstract property
    var speed: Int? = null


}