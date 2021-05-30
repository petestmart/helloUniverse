package com.example.hellouniverse

fun main(){

//    var name :String = "Denis"
//    name = null -> Compilation ERROR
    var nullableName : String? = "Denis"
//    nullableName = null
//
//    var len = name.length
//    var len2 = nullableName?.length
//    nullableName?.let { println(it.length)}
//    println(nullableName?.toLowerCase())

//    if(nullableName != null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }

    val name = nullableName ?: "Guest"
    println("name is $name")

    println(nullableName!!.toLowerCase())

//    val wifesAge: String? = user?.wife?.age ?: 0
}