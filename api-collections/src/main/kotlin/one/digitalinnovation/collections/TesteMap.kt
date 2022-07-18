package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 2000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("/-----------------------------")
    val map2 = mapOf("Pedro" to 4000.0, "Mário" to 3000.0)

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}