package BeyondBasic

fun String.hasSpaces() = find { it == ' '} != null

fun ekstensionExample():Boolean{
    return "Does it have spaces?".hasSpaces()
}
fun ekstensionExample0():Boolean{
    return "Does_it_have_spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant?.pull(){
    this?.apply{
        println("removing $this")
    }
}

class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "red"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample(){
    val plant = GreenLeafyPlant(size = 50)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}

fun main(args: Array<String>){
    println(ekstensionExample())
    println(ekstensionExample0())

    staticExample()

    val plant: AquariumPlant? = null
    plant.pull()
}