package com.example.hellouniverse

data class User(val id: Long, val name: String)

fun main(){
    val user1 = User(1, "Denis")

//    val name = user1.name
//    println(name)
//    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Denis Panjuta")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // print Denis Panjuta

    val (id, name) = updatedUser
    println("id=$id, name=$name")
}