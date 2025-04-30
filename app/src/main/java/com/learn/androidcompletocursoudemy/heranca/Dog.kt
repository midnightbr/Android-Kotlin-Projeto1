package com.learn.androidcompletocursoudemy.heranca

class Dog(cor: String, tamanho: String, peso: Double): Animal(cor, tamanho, peso) {
    override fun run() {
        super.run()
        println(" um cão de 4 patas!")
    }
}

/**
 * Polimorismo nada mais é do que sobrescrever um método existente,
 * como no caso a função run que já existe em Animal, mais foi sobrescrita
 * na classe Dog e Bird.
 */