package Paiza

//글자 수 제한
//문자열 길이
fun main() {

    val title = readLine()!!

    if (title.length < 20){
        println("OK")
    }else{
        println("NG")
    }
}