package com.learn.androidcompletocursoudemy.heranca

/**
 * Para que outra classe possa herda a classe animal e poder
 * sobrescrever os métodos nela existentes, é necessario colocar a palavra
 * 'open' para alterar a sua definição.
 */
abstract class Animal (
    var cor: String,
    var tamanho: String,
    var peso: Double
) {
    open fun run() {
        print("Correndo como")
    }

    open fun sleep() {
        println("Está dormindo!")
    }

    /**
     * Métodos abstratos são obrigatorios na implementação, no entanto,
     * os mesmos não devem ter corpo, já que cada classe que herdar a classe
     * devera escrever o código da funcionalidade
     */
    abstract fun launch()
}

/**
 * Obs.: Classes Open são classes concretas e podem ser estanciadas e utilizadas,
 * enquanto classes abstratas não, podem ser apenas herdadas.
 */
