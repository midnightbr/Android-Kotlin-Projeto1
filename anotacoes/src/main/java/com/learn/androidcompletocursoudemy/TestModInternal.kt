package com.learn.androidcompletocursoudemy

import com.learn.resources.UserResources

fun main() {
    val userResources = UserResources()
    userResources.name = "John"
    userResources.lastName = "177"
    userResources.FullName()
    userResources.Email()

    /**
     * Explicação da funcionalidade do modificador internal
     * Básicamente, o internal faz o mesmo papel que o private, mais de uma forma diferente.
     * No código acima, dá para ver que tanto o nome, sobrenome como a função/método FullName()
     * é acessado dentro da classe de teste.
     * Caso eu queira que o método FullName() seja acessado apenas por outra chamada de
     * outro método, basta adicionar a palavra internal.
     * Assim, o método só será visivel para as classes e métodos dentro do projeto resources,
     * fazendo assim mais uma camada de abstração e chamada de funções.
     * Vejo isso como bastante util quando você necessita que a função em questão
     * tenha necessidade de certos dados processados, fazendo com que dentro de outro método
     * seja chamado e passo os valores necessarios, evitando ser chamado em outros lugares por
     * engano.
     */
}