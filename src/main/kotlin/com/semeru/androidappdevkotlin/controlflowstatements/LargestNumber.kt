package com.semeru.androidappdevkotlin.controlflowstatements

fun main() {

    println("Please enter first number: ")
    val num1: Int = readLine()!!.toInt()

    println("Please enter second number: ")
    val num2: Int = readLine()!!.toInt()

    println("Please enter third number: ")
    val num3: Int = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("$num1 is the largest number")
    } else if (num2 > num1 && num2 > num3) {
        println("$num2 is the largest number")
    } else {
        println("$num3 is the largest number")
    }

}