package chap04.sec01

fun main(){

    val userId :Int = 1001
    var idCheck : String?

    idCheck = userId as? String?
    println("idCheck = ${idCheck}")
}