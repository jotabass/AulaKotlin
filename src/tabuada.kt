

fun main() {
    /**
     * tabuada de multiplicação simples.
     * foi acrescentado calculo com os operadores simples
     * dando a opção de escolha para somar ou dividir etc...
     */

    println("digite o operador desejado para tabuada sendo: soma,divisão,multiplicação e subtração ")
    val operador  = readLine()!!.toString()
    println("O operador escolhido foi ${operador}!")

    println("Digite um valor para calculo ")
    val num  = readLine()!!.toInt()
    //println("Multiplicando o número: ${num}")


    for (num2 in 0..10){
        //if (operador == "multiplicacao")
        //    println("${num} x ${num2} = ${num * num2}")
       // if (operador == "soma")
       //     println("${num} + ${num2} = ${num + num2}")
        //if (operador == "subitracao")
        //    println("${num} - ${num2} = ${num - num2}")
        if (operador == "divisao")
            println("${num} / ${num2} = ${num / num2}")

    }
}
