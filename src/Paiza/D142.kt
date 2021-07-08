package Paiza

import kotlin.math.ceil

fun main() {
    val num = readLine()!!.split(" ")

    println(ceil(num[0].toFloat() / num[1].toFloat()).toInt() * num[2].toInt())


//    println(ceil(test/2))
}