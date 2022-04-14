package chap08

import java.lang.module.ModuleReader

abstract class VehicleSpecs(val carName : String, val year: String, val model : String){
    abstract var maxSpeed : Double
    var color : String ="Black"

    abstract fun start()
    abstract fun end()

    fun displayinfo(){
        println("carName : ${carName}, year : ${year}, model : ${model}, maxSpeed : $maxSpeed")
    }
}

class Car(carName: String, year: String, model: String, override var maxSpeed: Double): VehicleSpecs(carName, year, model){
    override fun start() {
        println("Car Started!!!")
    }
    override fun end(){
        println("Car Stopped!!")
    }
}

class Motorcycle(carName: String, year: String, model: String, override var maxSpeed: Double) : VehicleSpecs(carName,year,model){


    override fun start() {
        println("Motorcycle Started!!1")
    }

    override fun end() {
        println("Motorcycle Stopped!!1")
    }
}

fun main(){
    val car = Car("GENESIS", "2022", "G80",300.0)
    car.displayinfo()
    car.start()
    car.end()

    val bike = Motorcycle("cycle","2020","KKK",400.0)
    bike.displayinfo()
    bike.start()
    bike.end()

}


