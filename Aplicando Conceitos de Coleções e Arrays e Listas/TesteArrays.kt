fun main () {
    val valores = IntArray(5) // do tipo inteiro
    valores[0] = 0
    valores[1] = 1
    valores[2] = 2
    valores[3] = 3
    valores[4] = 4

    //formas de iterar
    for (valor in valores) {
        println(valor)

    }
    println("\n")

    valores.forEach {
        println(it)
    }
    println("\n")

    for(indice in valores.indices) {
        println(valores[indice])
    }
    println("\n")
}