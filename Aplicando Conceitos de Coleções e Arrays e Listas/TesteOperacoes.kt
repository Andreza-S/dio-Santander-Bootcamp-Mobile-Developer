fun main() {
    val salarios = doubleArrayOf(0000.0, 1000.0, 2000.0, 3000.0, 4000.0)

    salarios.forEach { println(it) }
    println("\n")

    //capturando valores
    println("Nosso maior salário é: ${salarios.maxOrNull()}")
    println("Nosso menor salário é: ${salarios.minOrNull()}")
    println("A média dos salários é: ${salarios.average()}")
    println("\n")

    //filtrando
    val maiores = salarios.filter{it > 2655.0 }
    maiores.forEach{ println(it) }
    println("\n")

    //Verificando valores no intervalo
    println(salarios.count{it in 200.0..3000.0}) // contando a quantidade de valores
    println("\n")

    //Procurando um valor
    println(salarios.find{it == 3000.0})
    println(salarios.find{it == 500.0})
    println(salarios.find{it == 0000.0})
    println("\n")

    //Retornando true ou false sobre afirmação
    println(salarios.any{it == 3000.0})
    println(salarios.any{it == 500.0})
    println(salarios.any{it == 0000.0})


}

