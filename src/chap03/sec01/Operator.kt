package chap03.sec01

data  class Score(val a : Int, val b: Int){

    operator fun plus(obj2_Score : Score):Score{
        println("obj2_Score 123123123 = ${obj2_Score.b}")
        return Score(a+obj2_Score.a, b+ obj2_Score.b)
    }
}

operator fun Score.times(obj2_Score: Score):Score{
    return Score(a * obj2_Score.a, b * obj2_Score.b)
}

class Person(private val name : String){
    operator fun invoke(phone : String , email : String){
        println("name  = $name\n  phone = $phone \n email : $email")
    }

}

fun main(){
    val obj1 = Score(100,200)
    val obj2 = Score(100, 200)

    println("obj1==obj2 = ${obj1==obj2}")
    println("obj1===obj2 = ${obj1===obj2}")

    println("obj1 = ${obj1}")
    println("obj2 = ${obj2}")

    println("obj1 + obj2 = ${obj1 + obj2}")
    println("obj1 * obj2 = ${obj1 * obj2}")

    for(i in 1..10)print("$i, ")
    println()
    for(i in 'a' ..'z') print("$i, ")

    val obj3 = Person("손흥민")
    obj3.invoke("010-1234-1234","111@111.com")
    println("obj1 is Score = ${obj1 is Score}")
}