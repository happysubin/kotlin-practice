package chap10

val funVal = {x : Int, y:Int ->
    println("x = ${x}, y = ${y}")
    x+y
}

fun addFun(x: Int, y: Int):Int
{
    return x + y
}
val funVal2 = ::addFun

val sum = {10 + 20}

val test :(Int) -> Int = {it + 1}

fun main (){
    val result = funVal(10,20)
    println("result = ${result}")

    val result2 = addFun(20,10)
    println("result = ${result}")
    
    val result3 = funVal2(10,20)

    println("result3 = ${result3}")

    println("sum = ${sum()}")
}