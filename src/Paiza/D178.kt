package Paiza

//거꾸로하기
fun main() {
    val length = readLine()!!.toInt()
    val str = readLine()!!

    for (i in 0 until length){
        print(str[length-1-i])
    }
}