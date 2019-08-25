interface ExampleInterface {
   var myVar: Int     // abstract property
   fun absMethod()       // abstract method
   fun sayHello() = "Hello there" // method with default implementation
}

class InterfaceImpl: ExampleInterface {
    override var myVar: Int = 625

    override fun absMethod() {
        println("absMethod")
    }
}

fun main(args: Array<String>) {
    val interfaceImpl = InterfaceImpl()
    interfaceImpl.absMethod()
}