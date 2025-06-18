package com.semeru.androidappdevkotlin.operators

fun main(args: Array<String>) {

    var result: Int = 5 + 2 * 4
    println("Result = $result")

    result = (5 + 2) * 4
    println("Result = $result")

    val x = 8
    var y = 4
    var z = 2
    var sum = 0

    sum = x + --y + --z
    println("Sum = $sum")

}