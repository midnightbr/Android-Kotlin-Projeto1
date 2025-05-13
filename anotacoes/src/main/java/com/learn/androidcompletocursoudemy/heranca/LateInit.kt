package com.learn.androidcompletocursoudemy.heranca

/**
 * Obs.: lateinit funciona apenas em tipos referências como
 * String, List, Map e/ou classes personalizadas.
 * Tipos primitivos como Int, Double, Float, Boolean e etc, não podem ser utilizados.
 */
class InitLate {
    lateinit var descricao: String
    lateinit var preco: List<Double>
}

fun main() {
    val initial = InitLate()
    initial.descricao = "Testando late initial"
    initial.preco = listOf(1.0, 2.0, 3.0)
    println(initial.descricao)
    println(initial.preco)
}