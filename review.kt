
fun main() {
    //  kotlinc .\main.kt -include-runtime -d main.jar; java -jar main.jar
    println("Hello, World")
    println(sum(4, 8))

    // val name = "Adicom"
    // var age = 33
    // age++

    // var name: String? = null
    // val length: Int
    // length = name?.length ?: 0
    // length = name?.length ?: return
    // length = name?.length ?: throw Error()

    println(bigger(8, 11))

    val list = listOf("A", "B", "C")
    for (element in list) {
        println(element)
    }

    println(numberTypeName(0))
    println(numberTypeName(2))
    println(numberTypeName(6))
    println(numberTypeName(-1))

    println(signAsString(-1))
    println(signAsString(0))
    println(signAsString(1))

    println(Person("Lionel").hello())
    println(TurkishPerson("Hakan").hello())

    val otherPerson = OtherPerson("Ali", "Daei")
    println(otherPerson.fullName)
    otherPerson.fullName = "David Beckham"
    println(otherPerson.fullName)

    val mike = Student("Mike", 23)
    println(mike.toString())
    println(mike == Student("Mike", 23))
    println(mike == Student("Mike", 21))
    val hash = mike.hashCode()
    println(hash == Student("Mike", 23).hashCode())
    println(hash == Student("Mike", 21).hashCode())

    val (name, age) = mike
    println("$name, $age")

    val jake = mike.copy(name="Jake")
    println(jake)
}

// fun sum(a: Int, b: Int): Int {
//     return a + b
// }

fun sum(a: Int, b: Int) = a + b

fun bigger(a: Int, b: Int) = if (a > b) a else b

fun numberTypeName(x: Number) = when(x) {
    0 -> "Zero"
    in 1..4 -> "Four or less"
    5, 6, 7 -> "Five to seven"
    is Byte -> "Byte"
    else -> "Some number"
}

fun signAsString(x: Int) = when {
    x < 0 -> "Negative"
    x == 0 -> "Zero"
    else -> "Positive"
}

// class Person(val name: String, var age: Int)

open class Person(val name: String) {
    open fun hello() = "Hello, I am $name"
}

class TurkishPerson(name: String) : Person(name) {
    override fun hello() = "Merhaba, benim adim $name"
}

class OtherPerson(var name: String, var surname: String) {
    var fullName: String
        get() = "$name $surname"
        set(value) {
            val (first, rest) = value.split(" ", limit = 2)
            name = first
            surname = rest
        }
}

data class Student(val name: String, var age: Int)
