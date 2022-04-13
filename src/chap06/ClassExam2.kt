package chap06

fun main(){
    var user = User("member1","010-123-123")
    println("user1 = ${user.name} ${user.tel}")

    var user2 = User2("member2","010-321-321")
    println("user2 = ${user2.name} ${user2.tel}")

    var user3 = User3("member3","010-333-333")
    println("user3 = ${user3.name} ${user3.tel}")

    var user4 = User4("member4","010-444-444")
    println("user4 = ${user4.name} ${user4.tel}")
}

class User constructor(_name : String, _tel : String){
    val name : String
    val tel : String

    init{
        this.name = _name
        this.tel = _tel
        println("멤버 속성이 초기화되었습니다")
    }
}

class User2 (_name : String, _tel : String){
    val name : String
    val tel : String

    init{
        this.name = _name
        this.tel = _tel
        println("멤버 속성이 초기화되었습니다")
    }
}

class User3 (_name : String, _tel : String){
    val name : String = _name
    val tel : String = _tel

    init{
        println("멤버 속성이 초기화되었습니다")
    }
}

class User4(val name : String,val  tel : String){

    init{
        println("멤버 속성이 초기화되었습니다")
    }
}