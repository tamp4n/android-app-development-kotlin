package com.semeru.androidappdevkotlin.classes

class MySecondCars {
    var name: String = ""
    var model: Int = 0
        private set //encapsulation
        get

    constructor(name: String, model: Int) {
        this.name = name
        this.model = model
    }
}