import java.util.Arrays

fun main(args: Array<String>) {
    var a: ABC = BCD()
    println(a.number)
    a.think()
    a.talk()
}

open class ABC {
    open var number: Int = 1
    fun think() {
        print("Hey!! i am thiking ")
    }

    open fun talk() {}
}

class BCD: ABC() {
    override var number: Int = 2
    override fun talk() {
        println("i am talking")
    }
}