package com.rplgames.activitymaster.sintaxis

fun main() {
    //getMilenio(4800)
    //detectarValor(false)
    //val resultado=getResultNovato(11)
    //val resultado=getResultSemiSeñor(4)
    //val resultado= getResultSeñor(15)
    val resultado= getResultCorto(2)
    println(resultado)
}

fun getMilenio(año: Int) {
    when (año) {
        in 1..999 -> println("Aun no se cumple el milenio")
        in 1000..1999 -> println("Milenio 1")
        in 2000..2999 -> println("Milenio 2")
        in 3000..3999 -> println("Milenio 3")
        in 4000..4999 -> println("Milenio 4")
        in 5000..5999 -> println("Milenio 5")
    }
}

fun detectarValor(value: Any) {
    when (value) {
        is Int -> println(value + value + 6)
        is String -> println("Hola Mundo")
        is Boolean -> println("el valor es $value")
    }
}

fun getResultNovato(value: Int): String {
    when (value) {
        in 1..9 -> return "Numeros Naturales"
        else -> return "no es numero natural"
    }
}

fun getResultSemiSeñor(value: Int): String {
    val result=when (value) {
        in 1..9 -> "Numeros Naturales"
        else -> "no es numero natural"
    }
    return result
}

fun getResultSeñor(value: Int): String {
    return when (value) {
        in 1..9 -> "Numeros Naturales"
        else -> "no es numero natural"
    }
}

fun getResultCorto(value: Int) = when (value) {
        in 1..9 -> "Numeros Naturales"
        else -> "no es numero natural"
    }
