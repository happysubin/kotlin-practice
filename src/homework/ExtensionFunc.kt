package homework

fun main(){
    var car = Car()

    println("차종 : car.getBrandName() = ${car.getBrandName()}")
    println("가격 : car.getPrice() = ${car.getPrice()}")
}

class Car{
    fun getPrice(): Int{
        return 1000
    }
}

fun Car.getBrandName() : String{
    return "BMW-780"
}