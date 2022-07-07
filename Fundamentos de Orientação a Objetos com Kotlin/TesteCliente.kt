fun main() {

    val pedro = Cliente (
        nome = "Pedro German",
        cpf = "123.456.789-10",
        clienteTipo =  ClienteTipo.pf,
        senha = "tiodiorio"
    )

    println(pedro)
    TesteAutentificacaoLogin().autentica(pedro)
}