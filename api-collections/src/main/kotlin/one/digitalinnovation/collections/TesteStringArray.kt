package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "João"
    nomes[1] = "Pedro"
    nomes[2] = "Mário"

    for (nome in nomes) {
        println(nome)
    }

    println("/-----------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("/-----------------------------")
    val nomes2 = arrayOf("João", "Pedro", "Mário")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}