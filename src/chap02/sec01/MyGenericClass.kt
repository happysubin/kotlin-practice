package chap02.sec01

class MyGenericClass<T>{
    var userId :T? = null
}

fun main(){
    val obj1 = MyGenericClass<Int>()
    obj1.userId = 1234
    println("obj1.userID : ${obj1.userId}")

    val obj2 = MyGenericClass<String>()
    obj2.userId = "4321"
    println("obj2.userID : ${obj2.userId}")
}