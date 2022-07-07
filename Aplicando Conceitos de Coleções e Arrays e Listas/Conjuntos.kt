fun main () {
    val francisco = Funcionario("João Bezerra", 2000.0, "CLT")
    val francy = Funcionario("Francy Nilva", 18000.0, "PJ")
    val tatiana = Funcionario("Tatiana Golles", 10000.0, "PJ")


    val conjunto1 = setOf(francy,francisco)
    val conjunto2 = setOf(tatiana)

    //união dos conjuntos
    val uniaoConjuntos = conjunto1.union(conjunto2)
    uniaoConjuntos.forEach {println(it)}
    println("---------------------------")

    //subtraindo de um conjunto
    val conjunto3 = setOf(francy,francisco, tatiana)
    val subtracaoConjuntos = conjunto3.subtract(conjunto2)
    subtracaoConjuntos.forEach {println(it)}
    println("---------------------------")

    //apenas o que é comum entre os grupos
    val conjunto4 = conjunto3.intersect(conjunto2)
    conjunto4.forEach {println(it)}
    println("---------------------------")

}