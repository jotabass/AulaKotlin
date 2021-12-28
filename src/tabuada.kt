fun main() {
    /**
     * tabuada de multiplicação simples.
     */
    println("Digite um numero ")
    val num  = readLine()!!.toInt()
    println("Multiplicando o número: ${num}")
    for (num2 in 0..10){
        println("${num} x ${num2} = ${num * num2}")
    }
}
