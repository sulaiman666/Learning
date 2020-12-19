import kotlin.random.Random

fun main(args: Array<String>){
    val rollDice = { Random.nextInt(1, 12) }
    val rollDice0 = Random.nextInt(1, 12)
    println(rollDice())
    println(rollDice0)

    //Read input
    val hasil = readLine()?.toInt() ?: 0
//    println(hasil)

    //My own with argument
   val rollDice1 = { hasil: Int -> if (hasil == 0) 0
        else Random.nextInt(hasil) + 1
    }
    println(rollDice1(hasil))

    //Jawaban Udacity
    val jawabanRollDice = { Random.nextInt(12) + 1 }
    println(jawabanRollDice())

    val jawabanRollDice0 = {sides: Int -> if (sides == 0) 0
                            else Random.nextInt(sides) + 1 }
    println(jawabanRollDice0(hasil))

    val jawabanRollDice1: (Int) -> Int = { sides -> if(sides == 0) 0
                                           else Random.nextInt(sides)+1
    }
    //println(jawabanRollDice1(hasil))

    //Extra question
    // Function type notation wew can evade error when initiated

    gamePlay(rollDice1(4))
}

fun gamePlay(diceRoll: Int){
    println(diceRoll)
}