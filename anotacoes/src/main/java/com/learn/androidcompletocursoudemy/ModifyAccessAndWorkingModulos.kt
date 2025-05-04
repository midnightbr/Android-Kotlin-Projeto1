package com.learn.androidcompletocursoudemy

open class ModifyAccess {
    // Acessivel em qualquer parte do projeto
    fun Public() {
        println("Escrevendo na tela com a função publica")
        Private()
    }

    // Acessivel apenas dentro da classe
    private fun Private() {
        println("Chamando função privada")
    }

    // Acessivel apenas dentro da classe e das classes herdeiras
    protected  fun Protected() {
        println("Chamando função protegida!")
    }

    protected open fun ProtectedHerenca() {
        println("Classe protected que pode ser sobrescrita (override) por uma classe filha!")
    }
}

fun main() {
    val modifyAccess = ModifyAccess()
    modifyAccess.Public()
}