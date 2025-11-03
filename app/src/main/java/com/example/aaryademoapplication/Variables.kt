package com.example.aaryademoapplication

fun main() {
    // ----------- Data Types Example -----------
    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 43543
    var f: Long = -51321354L
    var i: Float = 5.6451344F
    var h: Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    // ----------- String Operations Example -----------
    var str: String = "Hello world"
    var length: Int = str.length
    var x: Boolean = str.equals("Hello world")
    var username: String = "   softwarica   "

    println(username.trim())       // removes spaces
    println(str)
    println(length)
    println(str.isEmpty())
    println(str.lowercase())
    println(str.uppercase())
    println(x)
    print(str.plus(", How are you?"))

    // ----------- String Operations Example -----------
    var p: Double =132.34
    var q: Int=p.toInt()
    var r: Byte=q.toByte()

    println(p)
    println(q)
    println(r)
}
