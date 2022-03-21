import com.example.practice.Person as Student


fun main(){
    val sony = Person("손흥민",30)

    println("name : ${sony.name}, age : ${sony.age}")

    val iu = Student("아이유",27,"컴퓨터공학")
    println("name : ${iu.name}, age :${iu.age}, ${iu.department}")
}