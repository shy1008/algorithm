//제동거리 계산
fun main() {
    val instrument = readLine()!!.split(" ").map { it.toInt() }

    val weight = instrument[0] // 자동차무게
    val speed = instrument[1] // 속도
    val breakPower = instrument[2] // 브레이크강도

    val L = weight * (speed * speed) / (2 * breakPower)

    println(L)

}


