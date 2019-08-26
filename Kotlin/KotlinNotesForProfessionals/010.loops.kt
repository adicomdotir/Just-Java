fun main(args: Array<String>) {
    var list = listOf("Hello", "World", "!!")
    for((index, element) in list.withIndex()) {
        println("$element at index $index")
    }

    repeat(5) {
        println("Hello")
    }

    var numbers = listOf(1, 2, 3, 4, 5)
    var numberStrings = numbers.filter { it % 2 == 0 }.map { "Number $it" }
    println(numberStrings)
}