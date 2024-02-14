package com.rplgames.activitymaster.sintaxis

// Valiriables en Kotlin

val age: Int = 30
fun main() {
    variablesAlfanumericas("Ponce Lopez")
}

fun subtract(firstNum:Int,secondNum:Int):Int=firstNum-secondNum



fun variablesNumericas() {

    val example: Long = 30
    val floatExample: Float = 30.500f
    val doubleExample: Double = 3.5232323

    println(doubleExample)
}

fun variablesBoolean() {
    val booleanExample: Boolean = true
    println(booleanExample)
}

fun variablesAlfanumericas(lastName: String="sin Apellido") {
    val name: String = "Raul"
    //val caracter: Char = 'P'


    var saludo = "Hola me llamo $name $lastName"
    println(saludo)
}