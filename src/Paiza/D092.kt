package Paiza

fun main() {
    val str = readLine()!!.split(" ").map { it.toInt() }
    val str2 = readLine()!!.split(" ").map { it.toInt() }


    val one = (str[2].toDouble() / (str[0] * str[1]).toDouble())
    val two = (str2[2].toDouble() / (str2[0] * str2[1]).toDouble())


    if (one > two){
        for (i in str2){
            if (i == str2[str2.size-1]){
                print("$i")

            }else{
                print("$i ")
            }
        }
    }else if (two > one){
        for (i in str){
            if (i == str[str.size-1]){
                print("$i")

            }else{
                print("$i ")
            }
        }
    }else {
        println("DRAW")
    }

}