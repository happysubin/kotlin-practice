package chap07

fun main(){
    val account = Account()
    val obj = Teacher()

    obj.teacherId="teacher"

    println("obj = ${obj.teacherId}")

    println("account.balance = ${account.balance}") //여기서 초기화

    val sony = Student()

    sony.initCheck()

    sony.initName("son")
    println("sony = ${sony.name}")
    sony.initCheck()
}

class Account(){
    init{
        println("init block")
    }
    
    val balance: Int by lazy{
        println("setting balance")
        10000
    }
}

class Teacher{
    lateinit var teacherId : String
}

class Student{
    lateinit var name : String
    fun initName(_name : String){
        this.name = _name
    }
    fun initCheck(){
        if(!::name.isInitialized) println("초기화 X") else println("초기화 : ${::name.get()}")
    }
}