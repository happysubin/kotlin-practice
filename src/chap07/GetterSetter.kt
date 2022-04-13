package chap07

fun main(){

    var sony = Teammate()
    sony.name="string"

    sony.tel = "0101010101"

    println("sony = ${sony.tel} ${sony.name}")

}

class Teammate{
    var name : String? =null
            get(){
                println("name getter")
                return if(field != null) field else "이름없음"
            }
            set(value){
                field = value
                println("name = ${name} setter")
            }
    var tel : String? =null
        get(){
            println("tel getter")
            return if(field != null) field else "번호없음"
        }
        set(value){
            field = value
            println("tel = ${tel} setter")
        }

}