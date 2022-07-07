data class Funcionario(
    val nome: String,
    val salario: Double,
    val contratacao: String
) {
    override fun toString(): String =

        """
            Nome: $nome
            Salário de $nome: R$ $salario            
        """.trimIndent()
}