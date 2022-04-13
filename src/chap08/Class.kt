package chap08

open class SuperClass {
    var supMember = 100
    open fun supMethod(){
        println("super class method")
    }
}

//SuperClass 상속
class SubClass : SuperClass(){
    
    override fun supMethod(){
        println("sub method")
    }
    
}

fun main(){
    val c = SubClass()
    println("c = ${c.supMember}")
    println("c.supMethod() = ${c.supMethod()}")
}