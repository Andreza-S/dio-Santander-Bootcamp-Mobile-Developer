// Esse documento é para testar a classe Banco, os documentos estão na mesma pasta por isso não é utilizado o import

fun main() {
    val testandoBanco = Banco("Juan", 53) // criando objeto e passando os parametros para o construtor da classe Banco

    println(testandoBanco.nome) // printando nome
    println(testandoBanco.numero) // printando numero
    print(testandoBanco.informacoes()) // printando o retorno do metodo
}