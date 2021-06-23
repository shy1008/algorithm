package Paiza

//주소의 표기
//문자열 조합
fun main() {
    val address = readLine()!!.toInt()
    val buildingNumber = readLine()!!.toInt()
    val room = readLine()!!.toInt()

    println("$address-$buildingNumber-$room")
}