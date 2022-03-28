package homework2

class CarSerialNumber{
    enum class Country(val label:String){
        KOREA("한국"), USA("미국")
    }

    object KoreanFactoryNo{
        var serialNumber = 0
            set(value){
                field=value
                println("current serialNumber(KOREA) = ${serialNumber}")
            }

        fun increaseNumber(){
            serialNumber++;
        }
    }

    object UsaFactoryNo{
        var serialNumber = 0
            set(value){
                field=value
                println("current serialNumber(USA) = ${serialNumber}")
            }

        fun increaseNumber(){
            serialNumber++;
        }
    }

    abstract class Car(country: Country){
        private val serial:Int
        abstract fun carInfo()

        fun printSerial():String{
            return "제품번호는 $serial"
        }

        init{
            when(country){
                Country.KOREA ->{
                    KoreanFactoryNo.increaseNumber()
                    serial = KoreanFactoryNo.serialNumber
                }
                Country.USA ->{
                    UsaFactoryNo.increaseNumber()
                    serial = UsaFactoryNo.serialNumber
                }
            }
        }

    }

    class Genesis(private val country: Country): Car(country){
        override fun carInfo() {
            println("이 자동차 모델은 제네시스고 ${printSerial()}번이다")
        }
    }

    class Grandeur(private val country : Country) : Car(country){
        override fun carInfo() {
            println("이 자동차 모델은 그렌져이고, ${printSerial()}번입니다")
        }
    }
}

fun main(){
    val car1 = CarSerialNumber.Genesis(CarSerialNumber.Country.KOREA)
    val car2 = CarSerialNumber.Grandeur(CarSerialNumber.Country.KOREA)
    val car3 = CarSerialNumber.Genesis(CarSerialNumber.Country.KOREA)
    println()

    var car4 = CarSerialNumber.Genesis(CarSerialNumber.Country.USA)
    var car5 = CarSerialNumber.Genesis(CarSerialNumber.Country.USA)
    println()

    val sumVal1 :(Int,Int)-> Int = {x,y -> x+y}
    println("sumVal1 = ${sumVal1(1,2)}")
    car3.carInfo()
}
