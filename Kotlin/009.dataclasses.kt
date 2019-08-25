fun main(args: Array<String>) {
    val a = Person(15, "Ali")
    val b = Person(15, "Ali")
    // Data class generate “toString()”,”hashCode()”,"equals()" method
    println(a)
    println(a.hashCode())
    println(a.equals(b))
}

data class Person(var age: Int, val name: String)