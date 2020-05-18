fun main(args: Array<String>) {
    val arr = arrayOf(23, 34, 64, 9, 12)
    forExample(arr)
    whileDoWhileExample(arr)
    breakExample()
    continueExample()
}

fun breakExample() {
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i  $j")
            if (i == 2 && j == 2) {
                break@myLoop
            }
        }
    }
    /*  OUTPUT
        1   1   1   2   1   3
        2   1   2   2
    */
}
    
fun continueExample() {
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@myLoop
            }
            println("$i  $j")
        }
    }
    /*  OUTPUT
        1   1   1   2   1   3
        2   1
        3   1   3   2   3   3
    */
}

fun whileDoWhileExample(arr: Array<Int>): Unit {
    println("while()")
    var index = 0;
    while(index < arr.size) {
        print(" ${arr[index]}")
        index++
    }

    println("do {} while()")
    var index = 0;
    do {
        print(" ${arr[index]}")
        index++
    } while (index <= arr.size)
}

fun forExample(arr: Array<Int>): Unit {
    println("for (item in arr)")
    for (item in arr) {
        print(" $item")
    }

    println()
    println("for (index in arr.indices)")
    for (index in arr.indices) {
        print(" ${arr[index]}")
    }

    println()
    println("for (i in 1..5)")
    for (i in 1..5) {
        print(" $i")
    }

    println()
    println("for (i in 1..5 step 2)")
    for (i in 1..5 step 2) {
        print(" $i")
    }

    println()
    println("for (i in 5 downTo 1)")
    for (i in 5 downTo 1) {
        print(" $i")
    }

    println()
    println("for (i in 5 downTo 1 step 2)")
    for (i in 5 downTo 1 step 2) {
        print(" $i")
    }
    
    println()
    println("(i, v) in arr.withIndex()")
    for ((i, v) in arr.withIndex()) {
        print(" $i=$v")
    }
}
