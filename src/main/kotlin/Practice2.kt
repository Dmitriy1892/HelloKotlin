fun main() {
    print(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        mood == "happy" && weather.toLowerCase() == "sunny" -> "go for a walk"
        mood == "sad" && weather.toLowerCase() == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}