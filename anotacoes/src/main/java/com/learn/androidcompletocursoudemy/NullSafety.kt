package com.learn.androidcompletocursoudemy

class Car () {
    var Cor: String
        get() {
            return Cor
        }
        set(value) {
            Cor = value
        }

    fun acelerar() {

    }
}

fun main() {
    var car: Car? = null

    /**
     * Se a variavel cor do carro for nula, ele recebe 'Cor padrao',
     * caso não esteja nulo, ele recebe a cor do objeto carro
     */
    val cor = car?.Cor ?: "Cor padrao" // Elvis Operator
    println(car?.Cor)
    println(cor)
}
