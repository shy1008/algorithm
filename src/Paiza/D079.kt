package Paiza

fun main() {

    val test = readLine()!!
    var check = false

    for (i in test){
        check = i != test[0]
    }

    if (check){
        println("OK")
    }else{
        println("NG")
    }


}