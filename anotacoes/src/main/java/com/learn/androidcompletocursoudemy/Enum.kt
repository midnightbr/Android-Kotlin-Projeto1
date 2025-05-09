package com.learn.androidcompletocursoudemy

enum class StatusPedido {
    Aguardando,
    Realizado,
    Pagamento_Confirmado,
    Enviado,
    Entregue
}

class Pedido(
    var total: Double,
    var itens: String,
    var statusPedido: StatusPedido = StatusPedido.Aguardando
){
    fun Status() {
        when (this.statusPedido) {
            StatusPedido.Realizado -> println("O pedido foi realizado!")
            StatusPedido.Pagamento_Confirmado -> println("O pagamento foi confirmado!")
            StatusPedido.Enviado -> println("Pedido ${StatusPedido.Enviado}!")
            StatusPedido.Entregue -> println("O pedido foi entregue!")
            else -> println("Status pedido: ${StatusPedido.Aguardando.ordinal}") // Obter a numeração do Enum
        }
    }
}

fun main() {
    val pedido = Pedido(125.00, "SSD")
    pedido.Status()
    pedido.statusPedido = StatusPedido.Realizado
    pedido.Status()
    pedido.statusPedido = StatusPedido.Pagamento_Confirmado
    pedido.Status()
    pedido.statusPedido = StatusPedido.Enviado
    pedido.Status()
}