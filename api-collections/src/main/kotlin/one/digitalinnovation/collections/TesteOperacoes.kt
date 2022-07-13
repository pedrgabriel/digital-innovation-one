package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1150.0, 2250.0, 3350.0)

    for (salario in salarios) {
        println(salario)
    }

    println("/-----------------------------")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("/-----------------------------")
    val filtroSalarial = salarios.filter { it > 2500.0 }
    filtroSalarial.forEach {
        println(it)
    }

    println("/-----------------------------")
    println(salarios.count{ it in 2000.0..5000.0 })

    println("/-----------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("/-----------------------------")
    println(salarios.any { it == 1150.0 })
    println(salarios.any { it == 500.0 })
}