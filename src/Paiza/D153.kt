package Paiza

//재료 선택
fun main() {
    val beef = readLine()!!.split(" ").map { it.toInt() }
    val arr = mutableListOf<Int>()
    for (i in beef.indices){
        arr.add(beef[i])
    }
    arr.sortDescending()
    println("${arr[1]}")
}