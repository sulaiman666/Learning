import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    dayOfWeek()

    println("\n")

    val isUnit=println("This is an Expression")
    println(isUnit)
    println("\n")

    val suhu = 10
    val keadaan = if (suhu < 100) "sejuk" else "panas"
    println(keadaan)

    println("\n")

    val pesan = "Suhu saat ini ${if (suhu < 100) "sejuk" else "panas"} dengan suhu $suhu C"
    println(pesan)
}

fun dayOfWeek(){
    println("What day is it today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(when(day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "No date"
    })
}