package one.digitalinnovation.bank

class Pessoa {
    var nome: String = "Pedro"
    var cpf: String = "123.456.789-00"
    private set

    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val pedro = Pessoa()
    println(pedro.pessoaInfo())
}