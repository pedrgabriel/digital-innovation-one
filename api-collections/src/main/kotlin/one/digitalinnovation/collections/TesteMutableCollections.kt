package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val mario = Funcionario("Mário", 3000.0, "CLT")

    println("/LIST-----------------------------")
    val funcionarios = mutableListOf(joao, mario)
    funcionarios.forEach { println(it) }

    println("/-----------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("/-----------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("/SET-----------------------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("/-----------------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(mario)
    funcionarioSet.forEach { println(it) }

    println("/-----------------------------")
    funcionarioSet.remove(mario)
    funcionarioSet.forEach { println(it) }
}