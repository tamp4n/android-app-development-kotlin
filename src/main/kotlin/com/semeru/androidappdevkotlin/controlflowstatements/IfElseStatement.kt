package com.semeru.androidappdevkotlin.controlflowstatements

fun main() {

    println("Please enter your age: ")
    val age: Int = readLine()!!.toInt()

    if (age >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are not eligible to vote")
    }

}