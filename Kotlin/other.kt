fun main(args: Array<String>) {
    var result = foo() // return Kotlin.Unit
}

fun oneLineFunction() = println("HelloWorld")

fun twoParameterFunction(bar: Any, baz: Any): Unit {
    // Nothing
}

fun oneParameterFunction(bar: Any): Unit {
    // Nothing
}

fun withoutParameterFunction(): Unit {
    // Nothing
}

fun nothingFunction(): Nothing {
    throw Exception()
}

open class Foo {
    open fun calculate(): Unit {}
}

class Other(bar) {
    
}

data class Data()

class Buzz : Foo {
    override fun calculate(): Unit {}
}