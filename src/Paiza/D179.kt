package Paiza

//몫의 계산
//코틀린 산술연산자 %
fun main() {
    val person = readLine()!!.toInt()
    val snack = readLine()!!.toInt()
    println("${snack % person}")
}