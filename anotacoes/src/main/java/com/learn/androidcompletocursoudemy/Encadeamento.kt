package com.learn.androidcompletocursoudemy

class Mensagem (
    val texto: String,
    val duracao: Int
) {
    companion object {
        const val DURACAO_CURTA = 1000
        const val DURACAO_LONGA = 3000

        fun construirMensagem(mensagem: String, duracao: Int) : Mensagem {
            return Mensagem(mensagem, duracao)
        }
    }

    fun mostrar() {
        println("$texto - $duracao")
    }
}

fun main() {
    // Utilizando Encadeamento de Métodos
    Mensagem
        .construirMensagem("Olá", Mensagem.DURACAO_LONGA)
        .mostrar()

    // Criando uma instancia e utilizando o método mostrar diretamente
    Mensagem("Olá", Mensagem.DURACAO_LONGA).mostrar()

    /**
     * Obs.: Não vejo a razão de tal utilização de encadeamento de métodos, já que,
     * ao que tudo aparente na demonstração da aula,
     * o método no companion object seria como se fosse um construtor da classe.
     * Sendo assim, não seria melhor já instancia a propria classe passando
     * os valores e chamando o método que ira efetuar a ação, como no exemplo acima?
     */
}