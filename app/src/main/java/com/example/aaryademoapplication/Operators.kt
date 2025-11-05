package com.example.aaryademoapplication

fun main(){
    var num1:Double = 10.6
    var num2:Double = 5.0
    var result:Double =0.0

    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result=num1 *num2
    println("num1 * num2 is $result")
    result=num1 / num2
    println("num1 / num2 is $result")
    result=num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator
    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z=x+y
    println("z = x+y = $z")
    z+=x
    println("z += x = $z")
    z-= x
    println("z -= x =$z")
    z*=x
    println("z *= x = $z")
    z/=x
    println("z/=x = $z")
    z %= x
    println("z %= x= $z")
//Unary Operator
    var number :Double =7.6
    var isCheck:Boolean = true;
    println("+number = ${+number}" );
    println("-number = ${-number}" );
    println("++number = ${++number}" );
    println("+number = ${--number}" );
    println("!isCheck = ${!isCheck}" );

    println("--------------------" );
    var results:Double = 4.7
    println("result :$results")
    //when the result++ is executed, the original value is evaluated first
    //and value of result is increased only after that
    println("result++ :"+results++)


    //Equality and Relational Operators
    var a:Int = 5
    var b:Int = 5

    println("a == b : "+ (a == b))
    println("a != b : "+ (a != b))
    println("a < b : "+ (a < b))
    println("a > b : "+ (a > b))
    println("a >= b : "+ (a >= b))
    println("a <= b : "+ (a <= b))
//Conditional Operators

    var number1:Int = 5
    var number2:Int = 8
    var number3:Int=12
    var resultss:Boolean = false;
    //conditional operator
    resultss=(number1> number2) && (number3 > number2)
    println(resultss)
    //conditional operator(||)
    resultss=(number1> number2) || (number3 > number2)
    println(resultss)

    //Operator precedence
    var ans:Int = 5+2*4
    println("Result = "+ans)
    ans = (5+2) * 4
    println("Result = "+ans)
    var p:Int = 8;
    var q:Int = 4;
    var r:Int = 2;
    var sum:Int = 0;

    sum=p + --q + --r

    print("p+ --q + --r ::: $sum")

    //rangeTo() Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("mycharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)

    //console Input in Android App Development

    print("Enter name:: ")
    var name:String? = readln();
    //The data user inputs is always a String so,
    // type conversion for data type other than String
    print("Enetr age:: ")
    var age:Int = readln()!!.toInt();








}