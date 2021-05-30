package com.example.hellouniverse

// Challenge
// Please write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers.
// Please use a for (in) loop in this exercise.
// Good luck :)

fun main(args: Array<Double>){
    val arrayList: ArrayList<Double> = ArrayList<Double>()
    var total = 0.0
    arrayList.add(1.0)
    arrayList.add(2.0)
    arrayList.add(3.0)
    arrayList.add(4.2)
    arrayList.add(5.3)
    for (i in arrayList){
        total += i
    }
    println("Average of the number in the arrayList is ${total/(arrayList.size)}")
}

