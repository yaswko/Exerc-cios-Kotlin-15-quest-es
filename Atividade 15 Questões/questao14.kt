fun main() {
    val numero = 6
    var fatorial = 1
    var contador = numero

    while (contador > 1) {
        fatorial *= contador
        contador--
    }

    println("Fatorial de $numero = $fatorial")
}