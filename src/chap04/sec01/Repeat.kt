package chap04.sec01

fun main (){
    first@ for (i in 1..3){
        for(j in 1..3){
            println("i : $i j : $j")
            if(j==2)continue@first
        }
    }
}