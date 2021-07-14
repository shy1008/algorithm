package Paiza

fun main() {
    val words: String = readLine()!!
    val ch1: Char = '-'
    val ch2: Char = '_'

    var i = 0
    var count1 = 0 //카운트
    var count2 = 0 //카운트

    while (i < words.length) {
        if (ch1 == words[i]) {
            count1 += count1 + 1
        }else if (ch2 == words[i]){
            count2 += count2 + 1
        }
        i++

    }

    if (count1 > count2){
        println(words.replace("_","-"))
    }else{
        println(words.replace("-","_"))
    }
}