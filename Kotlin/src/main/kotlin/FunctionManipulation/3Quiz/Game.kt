package FunctionManipulation.`3Quiz`

enum class Directions {
    START, NORTH, SOUTH, EAST, WEST, END
}

class Game{
    var path = mutableListOf<Directions>(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = { path.add(Directions.END); println("Game Over: $path"); path.clear(); false }
}

fun main(args: Array<String>){
    val game = Game()
    println(game.path)
    game.east()
    game.east()
    game.north()
    game.south()
    game.west()
    game.end()
    println(game.path)
}