fun main(args: Array<String>) {
    var objetct = genericsExample<String>("JAVA")
    var objetct1 = genericsExample<Int>(10)
    println(objetct)
    println(objetct1)
}

class genericsExample<out T>(input:T) {
    init {
        println("I am getting called with the value " + input)
    }
}