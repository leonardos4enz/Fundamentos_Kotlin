package com.example.fundamentos_kotlin

import kotlin.math.abs

fun main(){
    newTopic("Funciones nivel medio")
    sayHello()

    newTopic("Retorno de datos")
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    newTopic("Infix")
    val c = -3
    println("+${c.enableAbs(true)}")
    println(c.enableAbs(false))

}


//Función privada

//Unit = VOID
private fun sayHello(): Unit {
    println("Hello")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this