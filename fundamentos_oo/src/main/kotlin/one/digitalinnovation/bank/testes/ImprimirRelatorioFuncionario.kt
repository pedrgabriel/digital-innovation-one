package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Funcionario

class ImprimirRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}