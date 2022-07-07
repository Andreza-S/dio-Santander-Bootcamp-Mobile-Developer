fun main() {
    val jorge = Analista("Jorge Grue Foz", "111.222.333-44", 4500.0)
    println(jorge.nome)
    println(jorge.cpf)
    println(jorge.salario)
    ImprimeRelatorio.imprime(jorge)
}

// pode ser implementado assim caso não exista uma classe paar isso em um arquivo na mesma pasta
// fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())