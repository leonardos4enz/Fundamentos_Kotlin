package com.example.fundamentos_kotlin

fun main(){
    newTopic("Funciones nivel medio")
    sayHello()

    newTopic("Retorno de datos")
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

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
