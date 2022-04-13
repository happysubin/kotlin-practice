package chap04.sec01

fun main (){
    val score :Double =85.9
    var grade : Char = 'X'
    if (score >= 90){
        grade = 'A'
    }
    else if (score in 80.0..89.9){
        grade = 'B'
    }
    else if (score in 70.0..79.9){
        grade = 'C'
    }
    else if (score in 60.0..69.9){
        grade = 'D'
    }
    println("grade = ${grade}")

    var x =5
    when(x){
        1 -> {
            println("x = ${x}")
        }
        2 -> {
            println("x = ${x}")
        }
        3 -> {
            println("x = ${x}")
        }
        in 4..6 ->{
            println("x = ${x}")
        }
        else ->{
            println("else" )
        }

    }
}