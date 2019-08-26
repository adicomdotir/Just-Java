fun main(args Array<String>) {
    println("Hello, World")
    println("Enter Two number")
    var (a, b) = readLine()!!.split(' ')
    println("Max number is : $(maxNum(a.toInt(), b.toInt()")
}

fun maxNum(a: Int, b: Int): Int {
    if (a > b) return a
    return b
}

fun arraySample() {
    val empty = emptyArray<String>()

    val strings = Array<String>(size = 5, init = { index -> "Item #$index"})
    print(Arrays.toString(strings))
    print(strings.size)

    strings.set(2, "ChangedItem")
    print(strings.get(2))

    strings[2] = "NewChangedItem"
    print(strings[2])

    val s = arrayOf(1, 2, 3)
    val a = Array(3) -> { i -> i * 2 }
    val b = arrayOfNulls<Int>(3)

    // getOrNull, first, last, toHashSet,
    // sortedArray, sort, min, max

    val sec = Array(5, { i -> (i * i).toString() })
    for(s in sec) {
        println(s)
    }
    /*
    for(s: String in sec) {
        println(s)
    }
    */

}