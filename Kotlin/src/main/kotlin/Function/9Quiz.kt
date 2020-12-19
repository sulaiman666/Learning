fun main(args: Array<String>) {
    var fortune: String
    var fortune1: String
    var birthday: Int
    for (i in 1..10) {
        birthday = getBirthday()
        fortune = getFortune(birthday)
        fortune1 = getFortune1(birthday)

        println("\nYour fortune is: $fortune")
        println("\nYour second fortune is: $fortune1")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int{
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

fun getFortune(day : Int) :String{
    return when{
        day <= 7 -> "Have a nice start of the week"
        day < 14 -> "have a nice second week"
        day <= 31 -> "Have a nice month"
        else -> "No fortunes for you"
    }
}

fun getFortune1(day : Int) : String{
    val fortune = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    val index = when (day){
        in 1..7 -> 4
        28, 31 -> 2
        else -> day.rem(fortune.size)
    }
    return fortune[index]
}