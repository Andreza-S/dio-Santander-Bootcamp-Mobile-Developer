fun main() {
    ClienteTipo.values().forEach { elemento -> println("${elemento.name} - $elemento")}

    ClienteTipo.values().forEach { println("${it.name} - $it") }

    ClienteTipo.values().forEach { println("${it.name} - ${it.descricao}") }

    val pessoaF = ClienteTipo.pf
    println("${pessoaF.name} - ${pessoaF.descricao} ")

    val pessoaJ = ClienteTipo.pj
    println("${pessoaJ.name} - ${pessoaJ.descricao} ")
}