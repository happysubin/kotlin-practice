package chap01.sec01

fun main(){
    var user : String = "USER"
    val ch: Char ='A'
    val ch2 = ch + 1
    val a :Byte =100
    val b : Long = a + 1L
    println("b = ${b}")


    println("user = ${user}")
    
    var ch4 = 65

    println("ch4.toChar() = ${ch4.toChar()}")
    println("ch2 = ${ch2.toInt()}")

    println("ch4.toDouble() = ${ch4.toDouble()}")
}