package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 9
    values[1] = 5
    values[2] = 1
    values[3] = 3
    values[4] = 7

    for (valor in values) {
        println(valor)
    }

    println("/-----------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("/-----------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("/-----------------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}