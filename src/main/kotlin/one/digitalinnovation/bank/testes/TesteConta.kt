package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Conta

fun main() {
    val contaJoao = Conta("12345-0", "7890")
    println(contaJoao)

    try {
        contaJoao.saque(10.0)
    } catch (e: Exception) {
        println(e.message)
        contaJoao.deposito(150.0)
    }
    println(contaJoao)
}