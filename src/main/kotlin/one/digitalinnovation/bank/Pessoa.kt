package one.digitalinnovation.bank

class Pessoa {
    var nome: String = "Pedro"
    var cpf: String = "123.456.789-00"
}

fun main() {
    val pedro = Pessoa()

    println(pedro.nome)
    println(pedro.cpf)
}