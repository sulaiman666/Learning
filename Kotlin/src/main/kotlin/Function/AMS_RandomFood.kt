import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()
    eagerExample()
}

fun eagerExample(){
    val decoration = listOf<String>("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decoration.filter { it[0] == 'p' }
    println(eager)

    // Lazily filter
    val filtered = decoration.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())
}

fun changeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20): Boolean{
    return true
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")

    //Call changeWater function
    changeWater(day, 10, 21) // Change argument value
    changeWater(day) // Using argument value
    changeWater(day, 10) // Changing one of default value
    changeWater(day, dirty = 20) // Changing specific value

    if (changeWater(day)){
        println("Should changes water")
    }

    swimSpeed()
    swimSpeed(speed = "slow")
}

fun swimSpeed(speed: String = "fast"){
    println("Swimming at $speed speed")
}

fun randomDay() : String { //: String untuk declare kalo hasilnya itu string
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when (day){
        "Sunday" -> "flakes"
        "Monday" -> "pellets"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}