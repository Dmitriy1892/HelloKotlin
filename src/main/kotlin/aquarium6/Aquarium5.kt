package aquarium6

fun main() {
    fishExamples()
}

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy")

    myWith(fish.name) {
        println(capitalize())
    }

    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit ) {

    name.block()
}

