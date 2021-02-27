class SimpleSpice {

    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = 5
}

class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
    get() = when(spiciness) {
        "mild" -> 1
        "medium" -> 3
        "spicy" -> 5
        "very spicy" -> 7
        "extremely spicy" -> 10
        else -> 0
    }

    init {
        println("Name $name, Spiciness $spiciness, Heat $heat")
    }
}

fun makeSalt() = Spice("Salt")

fun main() {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val spice = Spice(name = "cayenne", spiciness = "spicy")
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    val spicelist = spices1.filter {it.heat < 5}
}