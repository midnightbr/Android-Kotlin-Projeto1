package com.learn.androidcompletocursoudemy

class Player {
    var kart: String = ""
    var pneu: String = ""
    var planador: String = ""

    fun acelerar(acelerador: Int ) {
        println("Acelerando a $acelerador%")
    }
}

fun main() {
    val jogador = Player()
}