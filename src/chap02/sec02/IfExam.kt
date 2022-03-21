package chap02.sec02

fun main(){
    var x =100
    if ( x == 100){
        println(" x = $x")
    }
    else {
        println("100이 아님")
    }

    var msg : String
    if (x == 100)msg = " x = 100"
    else msg = "x는 100이 아님"
    println(msg)

    val msg2 = if ( x== 100 ) "x = 100" else "x는 100이 아님"
    println(msg2)

    println(if ( x== 100)"x =100" else "x는 100이 아님")

    var x2 = f1(1); var x3 = f1(2)
    println("x1 = ${x2}")
    println("x3 = ${x3}")

    var x4 = f1(3); var x5=f1(5);
    println("x4 = ${x4}")
    println("x5 = ${x5}")
}

fun f1(b1 : Int):Int = when (b1) {
    1->{
        100
    }
    2->{
        200
    }
    3->{
        300
    }
    else ->{
        100 + 200 + 300
    }
}