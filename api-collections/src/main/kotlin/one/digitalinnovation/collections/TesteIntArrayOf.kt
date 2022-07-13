package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(9, 5, 1, 3, 7)

    values.forEach {
        println(it)
    }

    println("/-----------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}