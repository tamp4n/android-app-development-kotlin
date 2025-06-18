package com.semeru.androidappdevkotlin.operators

fun main(args: Array<String>) {

    val charRange: CharRange = 'a'.rangeTo('j')
    val myChar: Boolean = 'k' in charRange
    println("myChar range has k : $myChar")

}