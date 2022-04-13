package chap02.sec02

fun main(){
    var arr = arrayOf<Int>(1,2,3,4)
    val arr2 = Array(10){z -> 2*z}
    for (i in arr2) {
        print("${i} ")
    }


}