class Cliente(nome: String, cpf: String, val clienteTipo: ClienteTipo, val senha: String)
    : Pessoa2 (nome, cpf), Logavel {
    override fun login(): Boolean = "opert" == senha

    //função para relatorio
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}

    """.trimIndent()
}