fun main () {
    val valores = DoubleArray(5)
    valores[0] = 0000.0
    valores[1] = 1000.0
    valores[2] = 2000.0
    valores[3] = 3000.0
    valores[4] = 4000.0

    valores.forEach { println(it) }
    println("\n")

    //valor com mais 10%
    valores.forEachIndexed{index, valor ->
        valores[index] += valor * 0.1
    }
    valores.forEach { println(it) }
    println("\n")
}