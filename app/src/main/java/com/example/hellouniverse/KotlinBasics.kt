package com.example.hellouniverse

fun main(){
    // immutable variable
    val myName = "Frank"
    // type int 32 bit
    var myAge = 25

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300
    // TODO: Add new functionality

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans: The type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '$'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println("First Character " + firstCharInStr)
    println("Last Character " + lastCharInStr)

    // Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble : Double
//    result = result / 2
//    result /= 2
    resultDouble = (a / b)
    println(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==5
    println("isEqual is $isEqual")

    // String Interpolation
    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${5>3}")

    var heightPerson1 = 170
    var heightPerson2 = 170

    if(heightPerson1 > heightPerson2) {
        println("use raw force")
    }else if(heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    var age = -1
    if(age >= 21){
        println("You are of legal drinking age")
    }else if(age >= 18){
        println("You are of legal voting age")
    }else if(age >= 16){
        println("You are of legal driving age")
    }else {
        println("You are too young :(")
    }

    // When Expressions
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Input")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..1 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Input")
    }

    when(age){
        in 0..15 -> println("You're too young :(")
        in 16..17 -> println("You are of legal driving age")
        in 18..20 -> println("You are of legal voting age")
        in 21..200 -> println("You are of legal drinking age")
        else -> println("Invalid Input")
    }

    var x : Any = "Meow"
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    // While Loops
    var y = 1
    while(y <= 10) {
        println("$y")
        y++
    }
    println("while loop is done")

    var z = 100
    while(z > 0){
        println("$z")
        z -= 2
    }

    // Do While Loop
    var w = 15
    do{
        println("$w")
        w++
    }while (w <= 10)
    println("do while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For loops
    for(num in 1..10){
        println("$num")
    }

    for(i in 1 until 10){
        print("$i ")
    }

    for(i in 10 downTo 1){
        print("$i ")
    }

    // Practice Exercise
    // Write a for loop that runs from 0 to 10000
    // Once it's at 9001 it should write "IT'S OVER 9000!!!"
    for(num in 1..10000){
        if (num > 9000){
            println("IT'S OVER 9000!!!")
        }
        println("$num")
    }

    // Write a loop that checks the humidity (not the humidityLevel). The variable humidityLevel
    // starts at 80.  The variable humidity is initialized with "humid".  If it is "humid" then
    // it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    // Once the humidityLevel is below 60 it should print "it's comfy now" and
    // set the humidity to "comfy"
    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid"){
        humidityLevel -= 5
        println("Humidity Decreased to level: $humidityLevel")
        if(humidityLevel < 60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }
}

// Practice Exercise
// Write each of the data types with the specific value assignments
// "Android Masterclass"
val myString: String = "Android Masterclass"
// 13.37F
val myFloat: Float = 13.37F
// 3.14159265358979
val myDouble: Double = 3.14159265358979
// 25
val myInt: Int = 25
// 18881234567
val myLong: Long = 18_881_234_567
// true
var myBoolean: Boolean = true
// 'a'
val myChar: Char = 'a'

