package Paiza

import java.lang.StringBuilder

fun main() {
    val num = readLine()!!.toInt()
    val str = StringBuilder()
    str.append("Hello ")
    for (i in 0 until num){
        val str2 = readLine()!!
        if (i == num-1){
            str.append("$str2,")
        }else{
            str.append("$str2.")
        }
    }

    println(str)


}