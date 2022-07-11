package one.digitalinnovation.bank.testes
import one.digitalinnovation.bank.Banco

fun main() {
    val digiOneBank = Banco("digiOneBank", 12)
    //val digiOneBank = Banco(nome = "digiOneBank", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())

    val digiOneBank2 = digiOneBank.copy("digiOneBank2")
    //val digiOneBank2 = digiOneBank.copy(nome = "digiOneBank2")

    println(digiOneBank2.nome)
    println(digiOneBank2.numero)
    println(digiOneBank2.info())
}