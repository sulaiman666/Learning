package Aquarium

import kotlin.math.PI

open class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {

    var volume2 : Int
        get(){
            return width * height * length / 1000 //Lambda
        }
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var volume3: Int
        get() = width * height * length / 1000 //One line Lambda

        //private set(): Int {
        // Can be use to change visibility of the function, can only be access and see inside the class

        //protected set(): Int {
        // Can be see, but cant be access outside the class

        set(value) {
        // Public can be seen and can be access outside the class
            height = (value * 1000) / (width * length)
        }

    fun volume(): Int{
        return width * height * length / 1000
    } //Function type notation

    fun volume1() = width * height * length / 1000 //One line function

    open var water = volume3 * 0.8

    //Constructor
    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }

}

class TowerTank(): Aquarium(){

    override var water = volume3 * 0.8

    override var volume3: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }

}