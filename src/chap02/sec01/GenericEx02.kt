package chap02.sec01

class GenericEx02<T>{
    var member : T? = null
}

fun <T:Number> getSum(num1: T, num2:T): T{
    return (num1.toDouble() + num2.toDouble()) as T
}

fun main(){
    val obj1 = GenericEx02<String>()
    obj1.member = "member1"

    val obj2 = GenericEx02<Int>()
    obj2.member = 1004

    println(getSum(1,2))
    println(getSum(1f,2f))
    println(getSum(1.0,2.0))
}