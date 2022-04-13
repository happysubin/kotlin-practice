package chap06

class Friend(val _name : String, val _tel:String, val type: Int){

   // var name : String
   // var tel : String

    init{
       // this.name = _name
        //this.tel = _tel
        println("멤버 변수가 초기화 되었다.")
    }
}

class Friend2(val name: String, var tel : String, var type : Int =4){
    init{
        this.type= if(type<4)type else 4
    }
}



fun main(){
    var obj = Friend("kim","010-1234-1234",1)
    var obj2 = Friend2("kim","010-1234-1234")
    println("obj2.type = ${obj2.type}")
    println("obj = ${obj._name}")
}