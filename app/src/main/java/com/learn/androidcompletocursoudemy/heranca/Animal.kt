package com.learn.androidcompletocursoudemy.heranca

/**
 * Para que outra classe possa herda a classe animal e poder
 * sobrescrever os métodos nela existentes, é necessario colocar a palavra
 * 'open' para alterar a sua definição.
 */
open class Animal (
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
}

/**
 * Obs.: Nos meus testes sozinho, percebi que também é possivel utilizando a palavra
 * abstract, como no C#. Agora, o porque e qual a diferença entre o open e o abstract,
 * preciso estudar e pesquisar sobre o assunto.
 */