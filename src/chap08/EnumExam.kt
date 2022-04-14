package chap08

import chap07.Friend
import java.lang.reflect.Member

enum class FriendType{
    SCHOOL, COMPANY, SNS, OTHERS
}

fun gotFriendTypeName(type: FriendType){
    when(type){
        FriendType.SCHOOL ->{
            println("school friend")
        }
        FriendType.COMPANY ->{
            println("company friend")
        }
        FriendType.SNS ->{
            println("sns friend")
        }
        FriendType.OTHERS ->{
            println("etc friend")
        }
    }
}

interface MileageRate{
    fun getMileageRate() : Double

}

enum class MemberShip(val discountRate : Double) : MileageRate{
    PLATINUM(15.0){
        override fun getMileageRate():Double {
            return 10.0
        }
    },
    ROYAL(10.0){
        override fun getMileageRate(): Double = 7.0
    },
    GOLD(7.0){
        override fun getMileageRate(): Double = 5.0
    },
    SILVER(5.0){
        override fun getMileageRate(): Double = 2.5
    }
}

fun discountMain(){

    println("귀하는 ${MemberShip.PLATINUM} 고객으로 \n +" +
            "할인율은 ${MemberShip.PLATINUM.discountRate}%이고"+
            "마일리지 누적율은 ${MemberShip.PLATINUM.getMileageRate()}%입니다." )
    println()

    println(MemberShip.ROYAL.discountRate)
    println(MemberShip.GOLD.getMileageRate())
    println(MemberShip.SILVER)

}

fun main (){

    println(FriendType.SCHOOL.ordinal)
    println(FriendType.COMPANY.ordinal)
    println(FriendType.valueOf("COMPANY"))

    val friends = FriendType.values()
    for (item in friends){
        println("item = ${item}")
    }

    println(gotFriendTypeName(FriendType.SCHOOL))

    discountMain()
}
