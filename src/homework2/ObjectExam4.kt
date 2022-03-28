package homework2

fun main (){
    OuterClass.prinMsg()
}

class OuterClass{

    companion object Comobj{
        fun prinMsg(){
            println("동반 객체의 함수가 호출됨")
        }
    }
}