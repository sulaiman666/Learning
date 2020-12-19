package Class.`5Quiz`

fun main(args: Array<String>){
    val spice1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spiceList = spice1.filter { it.heat < 5 }
    //println("The list ${spiceList.init()}")
    //println(spice1[0])

    fun makeSalt() = Spice("Salt")
    makeSalt()
}