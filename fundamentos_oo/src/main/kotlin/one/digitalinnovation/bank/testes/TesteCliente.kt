package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Cliente
import one.digitalinnovation.bank.TipoCliente

fun main() {
    val jose = Cliente("jose", "111.222.333-44", TipoCliente.PF, "123456")
    println(jose)
    TesteAutenticacao().autenticaLogin(jose)
}