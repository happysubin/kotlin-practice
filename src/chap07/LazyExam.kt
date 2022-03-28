package chap07

fun main(){
    val account = Account()

    println("account.balance = ${account.balance}")
}

class Account(){
    init{
        println("init block")
    }
    
    val balance: Int by lazy{
        println("setting balance")
        10000
    }
}