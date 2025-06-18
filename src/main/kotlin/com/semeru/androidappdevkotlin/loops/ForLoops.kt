package com.semeru.androidappdevkotlin.loops

fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in numbers) {
        println("Number: $number")
    }

    val names = arrayOf("John", "Jane", "Jack", "Jill")
    for (name in names) {
        println("Name: $name")
    }

    val days = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    for (day in days) {
        println("Day: $day")
    }

    var sum: Int = 0
    for (number in 1..10) {
        println("Number: $number")
        sum += number
    }
    println("Sum: $sum")

    val myNumberArray = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in 0..myNumberArray.size - 1) {
        println("myNumberArray[$number]: ${myNumberArray[number]}")
    }

    val myNumberArrayX = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in myNumberArrayX.indices) {
        println("myNumberArrayX[$number]: ${myNumberArrayX[number]}")
    }

    val myNumberArrayY = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    myNumberArrayY.forEach { number ->
        println("myNumberArrayY: $number")
    }

}