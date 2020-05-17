fun main(args: Array<String>) {
    val arr = arrayOf(23, 34, 64, 9, 12)
    forExample(arr)
    whileExample(arr)
}

fun whileExample(arr: Array<Int>): Unit { }

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