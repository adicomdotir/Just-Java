fun main(args: Array<String>) {
    // If - Else
    val a: Int = 5
    val b: Int = 2
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // Use of When
    val x: Int = 5
    when (x) {
       1 -> println("x == 1")
       2 -> println("x == 2")
       3,4 -> println("x is 3 or 4")
       else -> { // Note the block
          println("x is neither 1 nor 2")
       }
    }

    // For Loop
    val items = listOf(1, 2, 3, 4)
    for (i in items) {
        println("values of the array " + i)
    } 
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
    for (index in items.indices) {
        println("the element at $index")
    }

    // While Loop and Do-While Loop
    var z:Int = 0
    println("Example of While Loop")
    while(z <= 10) {
        println(z)
        z++
    } 
}