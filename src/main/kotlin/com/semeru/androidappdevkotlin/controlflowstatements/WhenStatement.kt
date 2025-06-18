package com.semeru.androidappdevkotlin.controlflowstatements

fun main() {

    println("Please enter a day number of the week: ")
    val day: Int = readLine()!!.toInt()

    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid day number")
    }

}