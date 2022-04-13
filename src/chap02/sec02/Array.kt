package chap02.sec02

fun main(){
    val num = Array<Int>(10){i -> i}
    for(i in num){
        println("i = ${i}")
    }

    val sArray : Array<Array<Int>> = arrayOf(arrayOf(0,0,0,), arrayOf(1,2,3,4,),)

    for( x in sArray.indices){
        for (e in sArray[x]){
            print("e = ${e} ")
        }
        println()
    }


    println(1+2)

    var arr :String?= null

    println(arr?.length)

    println(sumFunc(1,2))
}


fun sumFunc(x:Int, y:Int):Int{
    var result = x+y
    return result

}