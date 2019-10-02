interface Foo {
    fun example()
}

class Bar: Foo {
    override fun example() {
        println("example function")
    }
}

class Baz(b: Bar): Foo by b

fun main(args: Array<String>) {
    val bar = Bar()
    Baz(bar).example()
}