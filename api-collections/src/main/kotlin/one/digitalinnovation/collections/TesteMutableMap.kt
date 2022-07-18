package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")
    val mario = Funcionario("Mário", 3000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(mario.nome, mario)

    println(repositorio.findById(joao.nome))

    println("/-----------------------------")
    repositorio.findAll().forEach { println(it) }

    println("/-----------------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}