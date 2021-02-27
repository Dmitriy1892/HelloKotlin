enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf<Direction>(Direction.START)
    var north = path.add(Direction.NORTH)
    var south = path.add(Direction.SOUTH)
    var east = path.add(Direction.EAST)
    var west = path.add(Direction.WEST)
    fun end()  { path.add(Direction.END); println("Game Over: $path"); path.clear(); false }

    fun move(where: () -> Boolean) { where.invoke() }

    fun makeMove(command: String?) {
        if (command.equals("n")) move { north }
        else if (command.equals("s")) move { south }
        else if (command.equals("e")) move { east }
        else if (command.equals("w")) move { west }
        else end()

    }
}

fun main() {
    val game = Game()
    println(game.path)
    game.north
    game.south
    game.east
    game.west
    game.end()
    println(game.path)

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}