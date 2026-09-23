fun main() {
    var soma = 0

    for (i in 2..50 step 2) {
        soma += i
    }

    println("Soma dos pares: $soma")
}