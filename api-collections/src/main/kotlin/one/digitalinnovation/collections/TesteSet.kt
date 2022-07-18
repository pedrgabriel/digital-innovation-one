package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val mario = Funcionario("Mário", 3000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(mario)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("/-----------------------------")
    val funcionarios3 = setOf(joao, pedro, mario)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("/-----------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}