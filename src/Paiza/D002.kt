package Paiza

fun main() {
    val one = readLine()!!.split(" ").map { it.toInt() }

    if (one[0] == one[1]){
        println("eq")
    }else if (one[0] > one[1]){
        println(one[0])
    }else{
        println(one[1])
    }

}