package homework2

fun main(){
    val account = Account()

    println("accout.balance = ${account.balance}")
    println("========")
    println("account.balance = ${account.balance}")
}

class Account(){
    init {
        println("init block")
    }
    
    val balance: Int by lazy{
        println("Setting balance : ")
        10000
    }
}