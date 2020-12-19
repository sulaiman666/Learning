fun main(args: Array<String>){
    var fortunes: String

    for (i in 1..10){
        fortunes = getFortuneCookie0()
        print("\nYour fortunes cookie is: $fortunes")
        if (fortunes.contains("Stop")) break
    }
}

fun getFortuneCookie0() : String {
    val fortune = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortune[birthday.rem(fortune.size)]
}