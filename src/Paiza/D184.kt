package Paiza

//세로로 표시
fun main() {
    val length = readLine()!!.toInt()
    val str = readLine()!!

    for (i in 0 until length){
        println(str[i])
    }
}