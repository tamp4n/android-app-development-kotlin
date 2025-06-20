package com.semeru.androidappdevkotlin.loops

fun main() {
    var number = 1
    do {
        println("Number: $number")
        number++
    } while (number <= 10)

    println("======================")
    var a = 5
    val b = a++ // a dinaikkan, kemudian b bernilai 5
    println("a: $a")
    println("b: $b")
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    while (a > b) {
        println(cars[2])
        break
    }

}