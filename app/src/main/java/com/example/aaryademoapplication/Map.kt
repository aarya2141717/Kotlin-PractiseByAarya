package com.example.aaryademoapplication

import androidx.compose.animation.scaleOut

fun main(){
    val countriesCapitals = mapOf("Nepal" to "Kathmandu","China" to "Nepal","India" to "Delhi")

    println("All keys :${countriesCapitals.keys}")
    println("All Values : ${countriesCapitals.values}")

    println("Capital of India is:${countriesCapitals["Nepal"]}")
//Immutable map
    val studentMarks=mapOf("ram" to 45,"shyam" to 45,"hari" to 45,"gita" to 45)
    println("Enter student name: ")
    val input : String = readln().lowercase()
    println(studentMarks[input])

    //Mutable Map
    val peopleMarks = mutableMapOf("ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45)

    peopleMarks["shyam"]=50
    peopleMarks.put("sabin",80)
    println("Enter student name: ")
    val inputs: String = readln().lowercase()
    println(peopleMarks[inputs])
}