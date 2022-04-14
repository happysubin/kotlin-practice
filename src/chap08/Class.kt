package chap08

open class SuperClass {
    var supMember = 100
    open fun supMethod(){
        println("super class method")
    }
}

//SuperClass 상속
class SubClass(member :String) : SuperClass(){
    var member : String = member
    override fun supMethod(){
        println("sub method")
    }
    
}

fun main(){
    val c = SubClass("super")
    println("c = ${c.supMember}")
    println("c.supMethod() = ${c.supMethod()}")
}