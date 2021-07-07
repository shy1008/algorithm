package Paiza

//세탁물과 먼지
//일본어 해석이 이상해서 문제를 재대로 모르겠다.
fun main() {
    val temp = readLine()!!.split(" ").map { it.toInt() }

    if (temp[0] >= 25 && temp[1] <= 60){
        println("Yes")
    }else if (temp[1] <= 20){
        println("Yes")
    }else{
        println("No")
    }

}