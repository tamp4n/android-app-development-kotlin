package com.semeru.androidappdevkotlin.interfaces

class Vehicles : CanGo, CanStop {
    override fun stop() {
        println("Vehicle can stop")
    }

    override val name: String
        get() = "Ferrari"
}