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
       1 -> print("x = = 1")
       2 -> print("x = = 2")
       3,4 -> print("x is 3 or 4")
       else -> { // Note the block
          print("x is neither 1 nor 2")
       }
    }

    // For Loop
    val items = listOf(1, 2, 3, 4)
    for (i in items) println("values of the array " + i)
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }

    // While Loop and Do-While Loop
    var x:Int = 0
    println("Example of While Loop")
    while(x <= 10) {
        println(x)
        x++
    } 
}