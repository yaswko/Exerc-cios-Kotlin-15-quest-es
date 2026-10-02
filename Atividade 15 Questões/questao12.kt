fun main() {
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for (i in nomes.indices) {
        if (idades[i] < 18) {
            println("${nomes[i]}: Acesso Negado (Menor de idade)")
        } else if (idades[i] <= 25) {
            println("${nomes[i]}: Acesso Permitido (Perfil Jovem)")
        } else {
            println("${nomes[i]}: Acesso Permitido (Perfil Sênior)")
        }
    }
}