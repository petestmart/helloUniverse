package com.example.hellouniverse

fun main(){
    // argument
    var addUpResult = addUp(5,3)
    println("addUpResult is $addUpResult")
    var avgResult = avg(5.1,3.2)
    println("avgResult is $avgResult")
}

// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a+b
}

fun avg(a: Double, b: Double) : Double{
    return (a+b)/2
}

fun myFunction(){
    println("Called from myFunction")
}