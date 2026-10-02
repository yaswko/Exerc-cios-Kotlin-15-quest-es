fun verificarEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Conta inválida: será apagada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val emails = listOf(
        "usuario@gmail.com",
        null,
        "",
        "teste@hotmail.com",
        null
    )

    verificarEmails(emails)
}