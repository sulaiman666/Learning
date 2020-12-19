fun main(args: Array<String>){
    for (str in args){
        val jam = str.toInt()
        println("Good ${ if (jam < 12) "morning" else "evening"}, Kotlin!")
    }

    // Answer 1
    if(args[0].toInt() < 12) println("Good morning, answer 1") else println("Good evening, answer 1")

    // Answer 2
    println("${if (args[0].toInt() < 12) "Good morning, answer 2" else "Good evening, answer 2"}")
}
