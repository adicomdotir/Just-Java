fun main(args: Array<String>) {
    val person = Person("Ali", 22, 85)
    person.info()
}

// class Person constructor(val name: String, val age: Int) {

//     init {
//         println("Initialized a new Person object")
//     }

//     fun info(): Unit {
//         println("Person[$name, $age]")
//     }
// }

class Person(val name: String, val age: Int) {

    init {
        println("Initialized a new Person object")
    }

    constructor(name: String, age: Int, weight: Int): this(name, age) {
        println("constructor")
    }

    fun info(): Unit {
        println("Person[$name, $age]")
    }
}