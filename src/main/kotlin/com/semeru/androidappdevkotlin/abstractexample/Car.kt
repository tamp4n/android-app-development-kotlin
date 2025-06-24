package com.semeru.androidappdevkotlin.abstractexample

class Car(override val model: Int) : Vehicle() {
    override fun vehicleName(name: String): String {
        return name
    }

}