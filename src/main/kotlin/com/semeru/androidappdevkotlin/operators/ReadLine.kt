package com.semeru.androidappdevkotlin.operators

fun main() {

    println("Enter your name: ")
    val name = readLine()
    println("Your name is $name")

    println("Enter your age: ")
    val age = readLine()!!.toInt()
    println("Your age is $age")
}