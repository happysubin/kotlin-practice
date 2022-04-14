package chap08

fun smartCast(data: Any):Int{
    if(data is Int) return data * data
    else return 0
}

fun smartCast2(obj: Any){
    if(obj is MyClass1) obj.fun1()
    else if (obj is MyClass2) obj.fun2()
}

class MyClass1{
    fun fun1(){
        println("fun1 호출")
    }
}


class MyClass2{
    fun fun2(){
        println("fun2 호출")
    }
}



fun main(){
    println("result : ${smartCast(10)}")
    println("result : ${smartCast(10.0)}")

    smartCast2(MyClass1())
    smartCast2(MyClass2())

}