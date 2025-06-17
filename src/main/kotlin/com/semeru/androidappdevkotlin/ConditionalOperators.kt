package com.semeru.androidappdevkotlin

fun main(args: Array<String>) {

    val a = 10
    val b = 20
    val c = 30

    var result: Boolean = false

    result = (a < b) && (b < c)
    println("Result: $result")

    result = (a < b) || (b < c)
    println("Result: $result")

    result = !(a < b)
    println("Result: $result")

}