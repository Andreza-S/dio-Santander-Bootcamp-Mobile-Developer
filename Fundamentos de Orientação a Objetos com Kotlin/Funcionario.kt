import java.math.BigDecimal

// essa classe herda caracteristicas da classe Pessoa2
abstract class Funcionario (
    nome: String,
    cpf: String,
    val salario: Double,
): Pessoa2(nome, cpf) {
    protected abstract fun calculaAuxilio(): Double


    //função para relatorio
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()
}