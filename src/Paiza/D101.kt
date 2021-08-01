package Paiza

fun main() {
    val num = readLine()!!.split(" ").map { it.toInt() }

    val even = num[0] % 2
    val odd = num[1] % 2

    if (even == 0 && odd == 0){
        println("NO")
    }else if (even != 0 && odd != 0){
        println("NO")
    }else{
        println("YES")
    }
}