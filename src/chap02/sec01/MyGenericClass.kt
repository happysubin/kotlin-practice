package chap02.sec01

class MyGenericClass<T>{
    var usrId: T? = null
}

fun main(){
    val obj1 = MyGenericClass<Int>()
    obj1.usrId = 2022001
    println("obj1.usrId = ${obj1.usrId}")
    
    val obj2 = MyGenericClass<String>()
    obj2.usrId="2022001"
    println("obj2.usrId = ${obj2.usrId}")
}