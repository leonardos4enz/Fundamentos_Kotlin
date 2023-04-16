package com.example.fundamentos_kotlin

fun main(){
    newTopic("Variables y constantes")

    val a = 2 //Constante
    var b = 3 //Variable
    println("a = $a\nb = $b")


}

fun newTopic(topic: String){
    println("\n========== $topic ==========\n")
}