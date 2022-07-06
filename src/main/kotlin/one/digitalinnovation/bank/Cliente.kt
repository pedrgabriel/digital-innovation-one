package one.digitalinnovation.bank

class Cliente(
    nome: String,
    cpf: String,
    val tipoCliente: TipoCliente,
    val senha: String
) : Pessoa(nome, cpf), Logavel{
    override fun login(): Boolean = "123456" == senha
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        TipoCliente: ${tipoCliente.descricao}
    """.trimIndent()
}