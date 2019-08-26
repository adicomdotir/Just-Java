fun main(args: Array<String>) {
    var list = listOf(1,2,3).map(::addTwo)
    println(list)

    // Arrow Function
    list = listOf(1,2,3).map({ (x: Int) -> x * 2})
    println(list)
}

fun addTwo(x: Int) = x + 2