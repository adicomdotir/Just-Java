class MyClass {
    var x: Int = 50
    fun sum() {
        println(x)
    }
}

open class Parent {}

class child : Parent() {
    val name: String;
}
