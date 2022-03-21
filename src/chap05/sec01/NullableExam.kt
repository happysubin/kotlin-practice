package chap05.sec01

fun main(){
    val s1:String? = null

    //val s2 : String = null 에러
    //val s3 : String = null 에러

    val s4 : String = "kotlin"
    val s5 : String? = s4
    var s6 :Int? = null
    s6 = 100

    var s7 : String? = "Kotlin"

    //println(s7.length) null값을 가질 수 있어서 안전하지 않아 에러가 발생.

    if(s7 != null) println(s7.length)

}