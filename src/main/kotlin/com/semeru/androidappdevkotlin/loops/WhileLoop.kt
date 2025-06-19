package com.semeru.androidappdevkotlin.loops

import kotlin.random.Random

fun main() {

    var i = 1
    while (i <= 10) {
        println("Number: $i")
        i++
    }

    println("======================")

    var j = 5
    while (j >= 1) {
        println("Number: $j")
        j--
    }

    println("======================")
    // 5! = 5 * 4 * 3 * 2 * 1
    var k = 1
    var factorial = 1
    while (k <= 5) {
        factorial *= k
        k++
    }
    println("Factorial of 5 is $factorial")

    println("======================")

    val number = Random.nextInt(0, 10)
    println("Please guess a number between 0 and 10: ")
    while (true) {
        val guess = readLine()!!.toInt()
        if (guess == number) {
            println("You guessed it!")
            break
        } else if (guess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }

    }


}