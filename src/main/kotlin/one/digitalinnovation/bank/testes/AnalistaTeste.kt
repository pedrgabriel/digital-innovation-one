package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Analista

fun main() {
    val joao = Analista("João", "111.222.333-44", 1000.00)
    ImprimirRelatorioFuncionario.imprime(joao)
}