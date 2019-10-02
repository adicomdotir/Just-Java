abstract class Car {
    abstract val name: String
    open var speed: Int = 0
}

class MyCar: Car() {
    override val name: String = "Saipa"
    override var speed: Int
        get() = 0
        set(value) {
            throw UnsupportedOperationException("The Car")
        }
}

fun main(args: Array<String>) {
    val myCar = MyCar()
    println(myCar.speed)
}