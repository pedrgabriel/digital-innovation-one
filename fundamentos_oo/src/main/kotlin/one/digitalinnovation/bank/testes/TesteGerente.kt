package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Gerente

fun main() {
val maria = Gerente("Maria", "111.222.333-44", 5000.00, "senha123")
    ImprimirRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autenticaLogin(maria)
}