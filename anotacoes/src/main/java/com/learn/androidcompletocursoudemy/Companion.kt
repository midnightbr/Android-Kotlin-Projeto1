package com.learn.androidcompletocursoudemy

class Automobile(
    var model: String,
    var velocity: Double
){
    /**
     * Companion Object tem o mesmo compartamento de uma classe static
     * no qual não tem a necessidade de uma instancia de classe para poder
     * obter valor ou ser utilizada, já que os não tem alteração do objeto ou método.
     * Como os valores não serão alterados, se usa declarações como const e val,
     * além da forma como declarar uma variavel é diferente, como demonstrado
     * no exemplo abaixo.
     * Companion object podem ser nomeados, ou seja, ter varios Companion objects com nomes
     * como as funções, mas normalmente não é utilizado Companion object nomeados.
     */

    /*
    companion object nomado {
        const val VELOCIDADE_MAXIMA = 250

        fun velocidadeMaxima() {
            println("Velocidade máxima eletronicamente: ${Automobile.VELOCIDADE_MAXIMA}")
        }

        fun retornaVelocidade(): Double {
            return 250.00
        }
    }
     */
    companion object {
        const val VELOCIDADE_MAXIMA = 250

        fun velocidadeMaxima() {
            println("Velocidade máxima eletronicamente: ${Automobile.VELOCIDADE_MAXIMA}")
        }

        fun retornaVelocidade(): Double {
            return 250.00
        }
    }

    fun exibirInformacao(){
        println("Informação do Carro: $model | $velocity km/h")
    }
}

fun main() {
    val carro = Automobile("Mustang", 210.50)
    carro.exibirInformacao()

    println(Automobile.VELOCIDADE_MAXIMA)
    Automobile.velocidadeMaxima()
    println(Automobile.retornaVelocidade())
}
/**
 * Como demonstrado no exemplo acima, o objeto carro não tem acesso
 * a variavel VELOCIDADE_MAXIMA, já que ela é uma variavel/método do tipo classe,
 * ou uma constante estatica. No entanto, o exemplo abaixo de carro monstra
 * que esta acessando a variavel VELOCIDADE_MAXIMA sem qualquer tipo de declaração
 * ou instancia.
 */