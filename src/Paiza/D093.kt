package Paiza

fun main() {
    val num = readLine()!!
    var check = true

    for (i in num){
        if (num[0] != i){
            check = false
        }
    }

    if (check){
        println(num)
    }else {
        println("No")
    }
}
