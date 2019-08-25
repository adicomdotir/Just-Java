import kotlin.properties.Delegates

interface Base {
   fun printMe() //abstract method
}

class BaseImpl(val x: Int) : Base {
   override fun printMe() { println(x) }   //implementation of the method
}

class Derived(b: Base) : Base by b  // delegating the public method on the object b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printMe() // prints 10 :: accessing the printMe() method 

    val user = User()
    user.name = "one"
    user.name = "two"
}

class User {
   var name: String by Delegates.observable("Welcome") {
      prop, old, new ->
      println("$old -> $new")
   }
}