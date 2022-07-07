class Pessoa { // nome da classe

    var nome: String = "Josue" //tipo de dados é string
    var cpf: String = "012.345.678-90" //tipo de dados é string
    private set // deixando o set ( a inserção de dados) em modo privado, não pode ser alterado fora do escopo da classe

    fun pritandoInformaoes() { // esse é um metodo da funcáo pessoa, nela as informacoes sao printadas na tela
        var informacoes = "O nosso cliente é: " + nome + "\nEsse é o CPF de " + nome+ ": " + cpf // concatenação
        println (informacoes) // printando
    }

}

fun main () { // função main para execução
    val josue = Pessoa() // objeto do tipo Pessoa, que herda as caracteristicas e comportamentos da classe Pessoa

    println(josue.nome) // podemos printar na tela o que tem em nome na classe Pessoa
    println(josue.cpf) // printar o cpf
    josue.pritandoInformaoes() // evocação do metódo
}