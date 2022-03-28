package homework2

import java.lang.reflect.Member

interface MileageRate{
    fun getMileageRate():Double
}

enum class MemberShip(val discountRate : Double) :MileageRate{
    PLATINUM(15.0){
        override fun getMileageRate(): Double {
            return 10.0
        }
    },
    ROYAL(10.0) {
        override fun getMileageRate(): Double = 7.0
    },
    GOLD(7.0){
        override fun getMileageRate(): Double = 5.0
    },
    SILVER(5.0){
        override fun getMileageRate(): Double = 2.5
    }
}

fun main(){
    println("귀하는 ${MemberShip.PLATINUM} 고객으로 할인율은 ${MemberShip.PLATINUM.discountRate}%이고," +
            "마일리지 누적율은 ${MemberShip.PLATINUM.getMileageRate()}% 입니다")
    println()

    println(MemberShip.ROYAL.discountRate)
    println(MemberShip.GOLD.getMileageRate())
    println(MemberShip.SILVER)
    println()

    val membership = MemberShip.values()
    for ( member in membership){
        println("멤버십: ${member.name}, 할인율: ${member.discountRate}, 마일리지: ${member.getMileageRate()}")
    }
}