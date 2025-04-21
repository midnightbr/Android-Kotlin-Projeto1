package com.learn.androidcompletocursoudemy

// Função sem retorno
fun soma() {
    println(2 + 10)
}

// Função com retorno, exemplo com retorno de inteiro
fun somar(): Int {
    return 5 + 7
}

fun main() {
    soma()
    val result = somar()
    println(result)
}