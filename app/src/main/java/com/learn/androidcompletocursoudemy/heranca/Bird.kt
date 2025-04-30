package com.learn.androidcompletocursoudemy.heranca

class Bird(cor: String, tamanho: String, peso: Double): Animal(cor, tamanho, peso) {
    override fun run() {
        println("Correr como um passaro de 2 patas.")
    }
}