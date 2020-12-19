fun main(args: Array<String>){
    println(whatShouldIDoToday1(userMood()))
    println(whatShouldIDoToday1(userMood(), temperature = 40))
}

fun whatShouldIDoToday1(mood:String, weather:String = "Sunny", temperature:Int = 24): String{
    return when {
        mood == "happy" && weather == "Sunny" && temperature == 24 -> "Perfect day to do exercise"
        mood == "sad" && weather == "Sunny" && temperature == 24 -> "Go out and be happy"
        mood == "happy" && weather == "Cloudy" && temperature < 24 -> "Stay inside and DANCE"
        mood == "sad" && weather == "Sunny" && temperature == 24 -> "Let's chilling with music"
        mood == "happy" && weather == "Rain" -> "Time to read some book with hot choco"
        mood == "sad" && weather == "Rain" -> "Look the sky is with you, so you are not alone"
        temperature > 35 -> "Lets go to swimming"
        else -> "Nothing to do"
    }
}

fun userMood():String{
    println("How do you feel?")
    val userMood: String = readLine().toString()
    return userMood
}
//
//fun main(args: Array<String>) {
//    println(whatShouldIDoToday("happy", "sunny"))
//    println(whatShouldIDoToday("sad"))
//    print("How do you feel?")
//    println(whatShouldIDoToday(readLine()!!))
//}
//
//fun isVeryHot (temperature: Int) = temperature > 35
//fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
//    mood == "sad" && weather == "rainy" && temperature == 0
//fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
//fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
//    return when {
//        isVeryHot(temperature) -> "go swimming"
//        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
//        isHappySunny(mood, weather) -> "go for a walk"
//        else -> "Stay home and read."
//    }
//}
