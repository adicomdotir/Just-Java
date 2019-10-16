fun main() {
    println("Hello, world!!!")
    val w: Workable = Worker(87)
    w.work()
}

interface Workable {
    fun work();
}

class Worker(val age: Int): Workable {
    override fun work() {
        println(age)
    }
}