import java.util.Arrays

fun main(args: Array<String>) {
    var  a = BCD()
    a.think()
    a.talk()
}

open class ABC {
    fun think() {
        print("Hey!! i am thiking ")
    }

    open fun talk() {}
}

class BCD: ABC() {
    override fun talk() {
        println("i am talking")
    }
}