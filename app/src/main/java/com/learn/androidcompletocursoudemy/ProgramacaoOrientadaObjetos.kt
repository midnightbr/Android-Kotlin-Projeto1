package com.learn.androidcompletocursoudemy

import android.app.admin.TargetUser

class Player {
    var kart: String = ""
    var pneu: String = ""
    var planador: String = ""

    fun acelerar(acelerador: Int ) {
        println("Acelerando a $acelerador%")
    }

    // Sobrecarga
    fun logar(email: String, senha: String) {
        println("Usuário logado com email: $email e senha $senha")
    }

    fun logar(username: String, senha: Int) {
        println("Usuário logado com username: $username e senha $senha")
    }
}

fun main() {
    val jogador = Player()
}