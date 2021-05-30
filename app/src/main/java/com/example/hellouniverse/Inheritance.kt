package com.example.hellouniverse

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class, and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

//// Super class, Parent class, or Base class
//open class Vehicle{
//    // properties
//    // methods
//}

// Sub class or child of vehicle
open class Automobile(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// sub class or child class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Automobile(maxSpeed, name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
//        println("Drove for $range KM on electricity")
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main(){
    var audiA3 = Automobile(200.0,"A3", "Audi")
    var teslaS = ElectricCar(240.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    teslaS.drive()
    teslaS.brake()
    audiA3.brake()
    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}