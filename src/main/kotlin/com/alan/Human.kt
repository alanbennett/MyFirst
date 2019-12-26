package com.alan

//類別：不指定傳入值
//class Human{
//
// }

//類別：指定傳入值
class Human(var weight:Float, var height:Float){

    fun bmi():Float{
        val bmi:Float=weight/(height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}