fun main(args: Array<String>) {
    // Byte,    Short,  Int,    Long,   Float,  Double
    // 1 * 8    2 * 8   3 * 8   4 * 8   3 * 8   4 * 8

    val minByte: Byte = -128
    val maxByte: Byte = 127
    println("Min Byte: $minByte, Max Byte: $maxByte")

    val minShort: Short = -32768
    val maxShort: Short = 32767
    println("Min Short: $minShort, Max Short: $maxShort")

    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647
    println("Min Int: $minInt, Max Int: $maxInt")

    val minLong: Long = -9223372036854775808
    val maxLong: Long = 9223372036854775807
    println("Min Long: $minLong, Max Long: $maxLong")

    // Characters, Boolean, Strings
    val letter: Char = 'A'
    println("$letter")

    val letter: Boolean = true
    println("Your character value is " + "$letter")

    var rawString :String  = "I am Raw String!"
    println("Hello!" + rawString)
}