package com.learn.androidcompletocursoudemy

// Função sem retorno
fun soma() {
    println(2 + 10)
}

// Função com retorno, exemplo com retorno de inteiro
fun somar(): Int {
    return 5 + 7
}

// Função Inline sem retorno
fun exibirSubtracao() = println(25 - 7)

// Função Inline com retorno
fun subtrair(valorA: Int, valorB: Int): Int = valorA - valorB

fun main() {
    soma()
    val result = somar()
    println(result)
    exibirSubtracao()
    val resultSubtracao = subtrair(25, 10)
    println(resultSubtracao)
}