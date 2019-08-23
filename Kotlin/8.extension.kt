fun main(args: Array<String>) {
    // Extension
    val mc = MyClass()
    val str = mc.add()
    println(str)
    println(MyClass.show())
}

class MyClass {
    var message: String = "null"
    fun foo(): String {
        return "Hello";
    }

    // Object Extension (Static)
    companion object {
        fun show(): String {
            return("You are learning Kotlin")
        }
    }

}

// Extension
fun MyClass.add(): String {
    return this.foo() + " Extension"
}