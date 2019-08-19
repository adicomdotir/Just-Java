fun main(args: Array<String>) {
   val person1 = Person("adicom.ir", 15)
   println("First Name = ${person1.firstName}")
   println("Age = ${person1.age}")

   val human: Human = Human("Ali", 25, "New Message")
   println(human.message)
}

class Person(val firstName: String, var age: Int) {}

class Human(val firstName: String, var age: Int) {
    val message:String  = "Hey!!!"
    constructor(name: String, age: Int, message: String): this(name, age) {}
}