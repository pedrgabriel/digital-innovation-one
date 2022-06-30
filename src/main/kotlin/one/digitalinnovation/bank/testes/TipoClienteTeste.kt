package one.digitalinnovation.bank.testes

import one.digitalinnovation.bank.TipoCliente

fun main() {
    TipoCliente.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    TipoCliente.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = TipoCliente.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = TipoCliente.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}