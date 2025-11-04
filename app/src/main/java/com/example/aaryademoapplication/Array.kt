package com.example.aaryademoapplication

fun main(args: Array<String>) {

    // Integer array
    var age = arrayOf(1, 2, 3)
    println(age.contentToString())
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("*******************************")

    // String array
    var names = arrayOf("ram", "shyam", "Hari")
    names[1] = "sandis"  // Updating second element

    println("The first element of name is " + names[0])
    println("The second element of name is " + names[1])
    println("The third element of name is " + names[2])

    // Printing size of array
    println("The size of name array is: " + names.size)
    //ArrayList
    var age1 = ArrayList<Int>()
    age1.add(3)
    age1.add(1,30)
    age1.add(4)

    var age2=arrayListOf<Int>(1,20,5)

    var name=arrayListOf<String>("aarya","hari","shyam");
    name.add("hari")
    name.add(4,"Sita")

    name.remove("shyam")
    name.removeAt(0)

    println(name)

    var mixArrayList=arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])

}
