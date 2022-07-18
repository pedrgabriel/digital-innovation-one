package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val mario = Funcionario("Mário", 3000.0, "CLT")
    val funcionarios = listOf<Funcionario>(joao, pedro, mario)

    funcionarios.forEach { println(it) }

    println("/-----------------------------")
    println(funcionarios.find{ it.nome == "Mário" })

    println("/-----------------------------")
    funcionarios.sortedBy{ it.salario }.forEach{ println(it) }

    println("/-----------------------------")
    funcionarios.groupBy{ it.tipoContratacao }.forEach{ println(it) }
}