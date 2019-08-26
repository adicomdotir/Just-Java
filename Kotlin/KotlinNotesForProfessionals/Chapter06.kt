fun main(args: Array<String>) {
    val color = Color.RED
    println(color)

    println(Planet.MARS) // MARS[population=0]
    Planet.MARS.population=3
    println(Planet.MARS) // MARS[population=3]

}

enum class Color {
    RED, GREEN, BLUE
}

enum class Planet(var population: Int = 0) {
    EARTH(7 * 1000000),
    MARS();

    override fun toString() = "$name[population=$population]"
}