fun main() {
    val sol = Gerente("Sol de Perez Silva", "111.222.333-44", 8500.0,"popotop" )
    println(sol.nome)
    println(sol.cpf)
    println(sol.salario)
    ImprimeRelatorio.imprime(sol)

    TesteAutentificacaoLogin().autentica(sol) // testando o login (senha)
}

//já existe dentro de um arquivo na pasta
// caso contrario pode instanciar assim fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())