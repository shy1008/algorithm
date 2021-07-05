package Paiza
//곱하기 목록
// D레벨에서 정답률이 71%이다.왜그런가 생각해봤더니 마지막 공백을 생각 못한 사람들이 있어서 그런거같다. 마지막은 공백추가를 하지않으면 정답.
fun main() {
    val number = readLine()!!.toInt()

    for (i in 1..9){
        print(i * number)
        if (i != 9){
            print(" ")
        }
    }
}