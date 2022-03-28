package homework2

class CustomUser{
    lateinit var userID : String
}

fun main(){
    
    val obj = CustomUser()
    
    obj.userID = "ugkang"
    println("obj.userID = ${obj.userID}")
}