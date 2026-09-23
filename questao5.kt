fun main() {
    var tentativa = 1

    while (true) {
        println("Tentativa $tentativa: Validando credenciais...")

        if (tentativa == 3) {
            break
        }

        tentativa++
    }
}