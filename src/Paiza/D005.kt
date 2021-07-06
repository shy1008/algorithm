package Paiza

// 산술 급수
// 등차 수열 = 인접한 수의 차이가 같은 수의 나열
fun main() {
    val num = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val first = 0

    for (i in 1..10){
        if (i == 10){
            print("${num[0]}")
        }else{
            print("${num[0]}" + " ")
        }
        num[0] += num[1]
    }

//    println(num[0] +  num[1])
}