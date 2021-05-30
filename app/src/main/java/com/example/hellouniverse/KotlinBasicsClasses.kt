package com.example.hellouniverse

fun main(){
    var peeWee = Person("Pee Wee", "Herman", 30)
    peeWee.hobby = "Bike Riding"
    peeWee.age = 32
    println("Pee Wee is ${peeWee.age} years old")
    peeWee.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
    var johnPeterson = Person(lastName = "Peterson")
    var petesPhone = MobilePhone("Android", "Google", "Pixel 3XL", 55)
    var workIphone = MobilePhone("iOS", "Apple", "iPhone X")
    var workAndroid = MobilePhone("Android", "Google", "Pixel 2")
    petesPhone.chargeBattery()
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member variables - Properties
    var age : Int? = null
    var hobby : String = "playing guitar"
    var firstName : String? = null
    
    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " + "firstName = $firstName and lastName = $lastName")
    }

    // Member Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName,lastName){
        this.age = age
        println("Initialized a new Person object with " + "firstName = $firstName and lastName = $lastName and age = $age")
    }

    // Member Functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }

}

class MobilePhone(osName: String, brand: String, model: String, battery: Int = 25){
    var osName : String = osName
    var brand : String = brand
    var model : String = model
    var battery : Int = battery


    init {
        println("Initialized a new phone with osName: $osName, brand: $brand, model: $model, battery: $battery")
    }


    fun chargeBattery(){

        if(battery < 100){
            println("The $brand $osName $model has an initial battery life of $battery%")
            battery += 30
            println("The $brand $osName $model has been charged 30% and now has a battery life of $battery%")
        }
    }

}