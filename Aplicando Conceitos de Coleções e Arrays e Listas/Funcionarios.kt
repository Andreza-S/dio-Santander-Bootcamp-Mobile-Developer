fun main () {
    val francisco = Funcionario("João Bezerra", 2000.0, "CLT")
    val francy = Funcionario("Francy Nilva", 18000.0, "PJ")
    val tatiana = Funcionario("Tatiana Golles", 10000.0, "PJ")

    val listaFuncionarios = listOf(francisco,francy,tatiana)

    //printando os elemntos da lista
    listaFuncionarios.forEach{println(it) }
    println("\n")

    //printando dados da funcionaria especifica
    println(listaFuncionarios.find{it.nome == "Francy Nilva"})
    println("\n")

    //printando de forma ordenada
    listaFuncionarios.sortedBy { it.salario }.forEach{ println(it)} // coloca em ordem crescente
    println("\n")

    //agrupando por contratação
    listaFuncionarios.groupBy { it.contratacao }.forEach{println(it)}



}

//data class Funcionario(
//    val nome: String,
  //  val salario: Double,
  //  val contratacao: String
//) {
//    override fun toString(): String =

//        """
 //           Nome: $nome
  //          Salário de $nome: R$ $salario
//        """.trimIndent()
//}