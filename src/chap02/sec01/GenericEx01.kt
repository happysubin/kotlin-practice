package chap02.sec01

class GenericEx01<T,U>{
    var usrId : T? = null
    var score : U? = null
}

fun main(){
    val obj: GenericEx01<String, Int> =GenericEx01();
    obj.usrId="ahn"
    obj.score=100

    println(" ${obj.usrId},${obj.score}")
}