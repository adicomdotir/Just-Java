fun main(args: Array<String>) {
    printNumbers(1,2,3,4)

    val numbers = intArrayOf(1,2,3)
    printNumbers(*numbers)

    printNumbers(5,6,*numbers,8,9)
}

fun printNumbers(vararg x: Int) {
    for (n in x) {
        println(n)
    }
}