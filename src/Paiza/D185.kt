package Paiza

//시급 계산
//코틀린 산술연산자 *
fun main() {
    val wage = readLine()!!.toInt()
    val officeHour = readLine()!!.toInt()
    println("${wage * officeHour}")
}