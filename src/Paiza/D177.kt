package Paiza

import java.io.BufferedReader
import java.io.InputStreamReader

//통신료의 계산
//공백을 포함한 문자열
fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    println(input[0] * input[1])


}