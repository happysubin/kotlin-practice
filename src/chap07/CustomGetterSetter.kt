package chap07

fun main(){
    val sony = Friend();
    println("#1 ${sony.name}, ${sony.tel}, ${sony.type}")

    sony.name= " 손흥민"
    sony.tel = "010-1234-5678"
    sony.type=1
    println("#2 ${sony.name}, ${sony.tel}, ${sony.type}")
}

class Friend{
    var name :String? = null
    get(){
        println("#3 name 속성 Getter 호출")
        return if (field!=null) field else "이름없음"
    }
    set(value){
        field = value
        println("#4 name 속성 Getter 호출 name = $field ")
    }

    var tel : String? =null
        get(){
            println("#5 tel 속성 Getter 호출")
            return if (field!=null) field else "이름없음"
        }
        set(value){
            field = value
            println("#6 tel 속성 Setter 호출 tel = $field ")
        }

    var type: Int = 4
        get(){
            println("#7 type 속성 Getter 호출")
            return field
        }
        set(value){
            field = value
            println("#8 type 속성 Setter 호출 type= $field ")
        }


}