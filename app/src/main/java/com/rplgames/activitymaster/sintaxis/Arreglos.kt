package com.rplgames.activitymaster.sintaxis

//Arreglos y for

fun main(){
    var weekDays=arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(weekDays[6])
    println(weekDays.size)
    //var posicion=3

    if (weekDays.size>0 || weekDays.size < 8)
        //println(weekDays[posicion])
    else{
       println("No existe este día")
    }

    for(position in weekDays.indices){
        println(weekDays[position])
    }

    for((position,value) in weekDays.withIndex()){
        println("la posicion $position contiene $value")
    }

    for (valor in weekDays){
        println("Ahora es $valor")
    }

}