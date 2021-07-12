package Paiza

//스읍.. 조금 고민이 많았던 문제 시간도 좀걸렸다.
//모든 자리의 숫자가 같은 상황일떄와 아닐때 구분을 same boolean변수를 통해 구별하여 짜보았다.
fun main() {
    val m = readLine()!!.split(" ")

    val first = m[0].substring(0,1)
    var same = false


    for (i in m[0]){
        for (i in m[1]){
            same = i.toString() == first
        }
        same = i.toString() == first
    }

    if (same){
        println("Yes")
    }else{
        println("No")
    }

}