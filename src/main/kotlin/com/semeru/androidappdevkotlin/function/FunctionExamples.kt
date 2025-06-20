package com.semeru.androidappdevkotlin.function

fun main() {

    show(10, 20)

    val result = add(10, 20)
    println("Result sum = $result")

    val minimumNumber = findMinimumNumber(10, 20)
    println("Minimum number is $minimumNumber")

}

fun show(num1: Int, num2: Int) { // return type is Unit
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// return type is Int, return value is minimumNumber
fun findMinimumNumber(num1: Int, num2: Int): Int = if (num1 < num2) num1 else num2