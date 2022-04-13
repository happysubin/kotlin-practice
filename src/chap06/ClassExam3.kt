package chap06

class Custom(name : String){
    var name : String = name
    var tel : String = ""
    var type : Int = 0
    init{
        println("기본 생성자 호출")
    }

    //기본 생성자와 보조 생성자가 함께 선언된 경우에는 반드시 기본 생성자를 호출해야 한다.
    //객체 생성시 _name, _tel이 전달되면 기본생성자를 호출(this())하여 _name을 전달
    constructor(_name : String, _tel : String):this(_name){
        this.tel = _tel
        println("보조 생성자 매개변수 2개")
    }

    constructor(_name : String, _tel: String,_type:Int):this(_name,_tel){
        this.type = if(_type < 4)_type else 4

        println("보조 생성자 매개변수 3개")
    }
}

fun main(){
    var obj = Custom("손")
    println("obj.name = ${obj.name} ${obj.tel}")

    var obj2 = Custom("손","010-123")
    println("obj.name = ${obj2.name} ${obj2.tel}")

    var obj3 = Custom("손","010-123",1)
    println("obj.name = ${obj3.name} ${obj3.tel} ${obj3.type}")
}