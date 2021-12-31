/**
 * tabuada de multiplicação simples.
 * foi acrescentado calculo com os operadores simples
 * dando a opção de escolha para somar ou multiplicar e etc...
 */
fun main() {

    println("digite o operador desejado para tabuada sendo: soma, multiplicação e subtração ")
    val operador  = readLine()!!.toString()
    println("O operador escolhido foi ${operador}!")

    println("Digite um valor para calculo ")
    val num  = readLine()!!.toInt()

    for (num2 in 0..10){
        if (operador == "multiplicacao")
            println("${num} x ${num2} = ${num * num2}")
        if (operador == "soma")
            println("${num} + ${num2} = ${num + num2}")
        if (operador == "subtracao")
           println("${num} - ${num2} = ${num - num2}")


    }
}
