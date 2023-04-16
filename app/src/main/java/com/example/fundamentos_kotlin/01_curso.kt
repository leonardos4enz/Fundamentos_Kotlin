package com.example.fundamentos_kotlin

fun main(){
    newTopic("Variables y constantes")

    val a = 2 //Constante
    var b = 3 //Variable
    println("a = $a\nb = $b")

    newTopic("Datos nulos y de cualquier valor")
    var objNull: Any? //Cualquier valor
    objNull = null
    objNull = "Leo"
    print(objNull)
}

fun newTopic(topic: String){
    println("\n========== $topic ==========\n")
}