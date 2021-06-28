package Paiza

//소리의 신음
//문자열 쪼개기 후 조건문
fun main() {
    val instrument = readLine()!!.split(" ").map { it.toInt() }

    if (instrument[0] > instrument[1]){
        println(instrument[0] - instrument[1])
    }else {
        println(instrument[1] - instrument[0])
    }
}