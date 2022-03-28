package homework2

data class Customer (val name : String, val age : Int, val tel:String){
    init{
        println("멤버 속성이 초기화 되었습니다.")
    }

    var nationality : String = "KOREA"
    constructor(name : String, age : Int, tel : String, _nationality: String):this(name,age,tel){
        nationality = _nationality
    }
}

fun main(){
    val obj1 = Customer("손흥민", 28, "010-1234-5678")
    val obj2 = Customer("이강인", 19, "010-456-7891")
    val obj3 = Customer("봉준호", 52, "010-4321-5678","KOREA")

    println("obj1 = ${obj1}")
    println("obj2 = ${obj2}")
    println("obj3 = ${obj3}")
    println("${obj3.name} 감독의 국적은 ${obj3.nationality}입니다.")

    println(obj1 == obj2)

    println(obj1.hashCode() == obj2.hashCode())

    println("obj1.hashCode(): ${obj1.hashCode()} == obj2.hashcode() : ${obj2.hashCode()}")

    val obj4 = obj1.copy(tel="010-7777-7777")
    println("obj4 = ${obj4}")

    println(obj1 == obj4)

    println(obj1 === obj4)

    val (fName, fAge, fTel) = obj1

    println("$fName, $fAge, $fTel")

    val customerList = listOf(obj1,obj2,obj3,obj4)
    for((name,age,tel) in customerList){
        println("name = ${name}, name = ${age}, tel = ${tel}")
    }
}