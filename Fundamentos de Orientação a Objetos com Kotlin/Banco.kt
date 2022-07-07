data class Banco(    // é um aData classe, aqui a classe recebe informações, mas as variaveis originais não são alterados
    val nome: String,
    val numero: Int
) {
    fun informacoes() = "Nome: " + nome + "\n" + "Numero: " + numero.toString() // toString() converte o valor para o tipo string
}
