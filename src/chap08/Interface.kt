package chap08

interface Inter1 {
    fun method1()
    fun method2(){
        println("method 2")
    }
}

interface Inter2{
    fun method3()
    fun method4(){
        println("method 4")
    }
}

fun testF1(il: Inter1){
    il.method1()
    il.method2()
}
fun testF2(il: Inter2){
    il.method3()
    il.method4()
}

class InterfaceTest1 : Inter1{
    override fun method1() {
        println("InterfaceTest1 method1")
    }
}

class InterfaceTest2 : Inter1,Inter2{
    override fun method1() {
        println("InterfaceTest2 method1")
    }

    override fun method3() {
        println("InterfaceTest2 method3")
    }
}

fun main (){
    var obj1 = InterfaceTest1()
    obj1.method1()
    obj1.method2()

    testF1(obj1)
    println("hhhhhhh")

    var obj2 = InterfaceTest2()
    obj2.method1()
    obj2.method2()
    obj2.method3()
    obj2.method4()
    testF2(obj2)



}