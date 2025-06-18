package com.semeru.androidappdevkotlin.controlflowstatements

fun main() {

    println("Please enter your age: ")
    val age: Int = readLine()!!.toInt()

    if (age < 13) {
        println("You are a child")
    } else if (age < 19) {
        println("You are a teenager")
    } else {
        if (age < 65) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    }

}