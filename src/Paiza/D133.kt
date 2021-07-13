package Paiza

//주식의 이익
//모든 변수를 다이용하자.
fun main() {
    val yen = readLine()!!.toInt()
    val stock = readLine()!!.toInt()
    val profit = readLine()!!.toInt()

    val benefit = profit * (yen/stock)
    val mystock = stock * (yen/stock)

    println(benefit-mystock)
}