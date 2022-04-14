package chap08

import javax.swing.plaf.nimbus.State

object StateManager{
    init{
        println("초기화")
    }
    var msgNumber : Int = 0
    var msgContent : String ? =null

    fun showMessage(){
        println("msgNumber = ${msgNumber}")
        println("msgContent = ${msgContent}")
    }
}

interface Interf{
    fun iMethod()
}

abstract class AbsClass{
    abstract fun aMethod()
}


fun main (){

    for ( i in 1..10){
        StateManager.msgNumber +=2
        StateManager.msgContent = StateManager.msgNumber.toString() + " 텅 "
        StateManager.showMessage()
    }


    var obj = object : AbsClass(),Interf{
        override fun aMethod() {
            println("익명 객체의 aMethod")
        }

        override fun iMethod() {
            println("익명 객체의 iMethod")
        }
    }
    obj.aMethod()
    obj.iMethod()
}