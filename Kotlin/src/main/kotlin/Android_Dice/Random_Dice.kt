package Android_Dice

fun main(args: Array<String>){
    val firstDice = Dice(6)
    println("Your ${firstDice.color} color dice with ${firstDice.sides} sides number: ${firstDice.roll()}")
    val secondDice = Dice(20, "Black")
    println("Your ${secondDice.color} color dice with ${firstDice.sides} sides number: ${secondDice.roll()}")
    val coin = Coin()
    println("Coin toss: ${coin.flip()}")
}

class Dice(val sides: Int, val color: String = "White"){
    fun roll(): Int{
        return (1..sides).random()
    }
}

class Coin(){
    fun flip(): String{
        val facing = (1..2).random()
        return when (facing){
            1 -> "Head"
            2 -> "Tail"
            else -> "No coin tossed"
        }
    }
}