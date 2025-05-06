package com.learn.androidcompletocursoudemy

interface IEmprego {
    fun sairDoTrabalho()
    fun entrarNoTrabalho()
}

interface IViagem {
    fun procurarDestino()
    fun pegarAviao()
}

abstract class Pessoa {
    fun comer() {
        println("Estou comendo!")
    }
}

class Developer : Pessoa(), IEmprego {
    override fun sairDoTrabalho() {
        println("Saindo do trabalho!")
    }

    override fun entrarNoTrabalho() {
        println("Entrando no trabalho!")
    }
}

class Gamer : Pessoa() {

}

class Motorista : Pessoa(), IEmprego, IViagem {
    override fun sairDoTrabalho() {
        println("Passageiro desembarcando!")
    }

    override fun entrarNoTrabalho() {
        println("Buscando passageiro!")
    }

    override fun procurarDestino() {
        println("Cancun")
    }

    override fun pegarAviao() {
        println("Comprando as passagens!")
    }

}

fun main() {
    val gamer = Gamer()
    val motorista = Motorista()
    val developer = Developer()

    gamer.comer()
    motorista.pegarAviao()
    developer.entrarNoTrabalho()

}