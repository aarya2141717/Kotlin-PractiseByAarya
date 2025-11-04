package com.example.aaryademoapplication

fun main(){
    val numbers:List<String> = listOf("one","three","four","five")

    println(" Number of elements: ${numbers.size}")
    println("Third element:${numbers.get(2)}")
    println("Fourth element:${numbers[3]}")
    println("INdex of element \"two\": ${numbers.indexOf("two")}")

    //Immutable list
    val lst = listOf("one","two","three")
    println("Mutable list")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
    //Mutable List
    val mutableLst=mutableListOf<String>("one","two","three")
    mutableLst.add("four")
    println("Immutable list")
    for ( i in mutableLst.indices){
        println(mutableLst[i])
    }




}