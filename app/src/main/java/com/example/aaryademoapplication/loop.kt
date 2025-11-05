package com.example.aaryademoapplication

import kotlin.random.Random

fun main() {
    for (i in 1..9) {
        println(i)
    }

    var sum: Int = 0
    for (x in 0..5) {
        println(x)
        sum += x
    }

    var sums: Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sums += x
        }
    }

    var sumss: Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sumss += x //sum=sum+x
        }
    }
    println("The sum of even numb er is $sum")

    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicle.indices) {
        println("The value in $y index is : - " + vehicle[y])
    }

    //for each loop

    var vehicles = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")

    vehicles.forEach {
        println(it)

    }
    //While Loop

    var i:Int=0
    while (i<5){
        print(i)
        i++
    }

    var k =1
    var fact =1
    while (k<6){
        fact*=k;
        println("$k! = $fact")
        k++
    }

    var number = Random.nextInt(0,10000)
    println("Please enter any number from 0 to 10000: -")
    while(2>1){
        var userGuess:Int = readln().toInt()
        if (userGuess == number){
            println("congratulations!!!,you won")
            break
        }else if(userGuess<number){
            println("Increase your guess")
        }else{
            println("Decrease your guess")
        }
    }
    //do while loop
    var numbers = 1
    do {
        println(numbers)
        number++
    }while (number<=15)


}