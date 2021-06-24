
//숫자 맞춘 게임
//공백 문자열 산술연산
fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val myNum = readLine()!!.toInt()
    println("${input[0] - myNum} ${input[1] - myNum}")
}