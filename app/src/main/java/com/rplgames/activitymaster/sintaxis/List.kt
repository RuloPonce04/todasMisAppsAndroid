package com.rplgames.activitymaster.sintaxis

fun main() {
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","miercoles","Jueves","Sabado")

    weekDays.add(4,"Viernes")

    if (weekDays.isNotEmpty()){
        println(weekDays)
        println(weekDays.last())
    }else{
        println("No tienes elemntos en tu Lista")
    }

}

fun inmutableList(){
    val readOnly: List<String> = listOf("Raul","Juan","Mike","Kevon")

    println(readOnly.size)

    println(readOnly)

    println(readOnly[0])

    println(readOnly.last())

    println(readOnly.first())

    val example=readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach{readOnly -> println(readOnly) }
}