package com.example.aaryademoapplication

import androidx.compose.animation.scaleOut

fun main() {
    print("")
    println()

    //mutable:we can reassign the variable latrer
    var name:String ="Ram";
    //immutable
    val age: Int=16
     var age1=arrayOf(10,20,30)
    age1[2]=40
    println(age1[1])

     println("My name is ${name.uppercase()} and age is $age")
}