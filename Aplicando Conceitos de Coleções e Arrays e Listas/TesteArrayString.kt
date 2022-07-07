fun main() {
    val valores = Array(5){""}
    valores[0] = "J"
    valores[1] = "U"
    valores[2] = "L"
    valores[3] = "I"
    valores[4] = "A"


    valores.forEach {
        println(it)
    }
    println("\n")

    //criando uma cópia e aplicando sort

    val valoresSortidos = valores
    valoresSortidos.sort()
    valoresSortidos.forEach {println(it)} // forma lambda
    println("\n")
}