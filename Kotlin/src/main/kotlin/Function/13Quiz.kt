fun main(args: Array<String>){
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(mood:String, weather:String = "Sunny", temperature:Int = 24): String{
    return when {
        mood == "happy" && weather == "Sunny" && temperature == 24 -> "Perfect day to do exercise"
        mood == "sad" && weather == "Sunny" && temperature == 24 -> "Go out and be happy"
        mood == "happy" && weather == "Cloudy" && temperature < 24 -> "Stay inside and DANCE"
        mood == "sad" && weather == "Sunny" && temperature == 24 -> "Let's chilling with music"
        mood == "happy" && weather == "Rain" -> "Time to read some book with hot choco"
        mood == "sad" && weather == "Rain" -> "Look the sky is with you, so you are not alone"
        else -> "Nothing to do"
    }
}