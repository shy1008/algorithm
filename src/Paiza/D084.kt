package Paiza

//영어로 무엇 월?
fun main() {
    val input = readLine()!!
    val str = input
        .replace("1","January")
        .replace("2","February")
        .replace("3","March")
        .replace("4","April")
        .replace("5","May")
        .replace("6","June")
        .replace("7","July")
        .replace("8","August")
        .replace("9","September")
        .replace("10","October")
        .replace("11","November")
        .replace("12","December")

    println(str)
}