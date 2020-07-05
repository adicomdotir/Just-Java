fun main(args: Array<String>) {
	listExample()
	setExample()
 	mapExample()   
}

fun listExample() {
    val list = listOf<String>()
	println(list)
}

fun setExample(): Unit {
    val mySet = setOf(1,2,3,4,5,1,2)
    println(mySet)
}

fun mapExample() {
    val map = mapOf<String, Int>("One" to 1, "Two" to 2, "Three" to 3)
    
    println(map.get("One"))
    println(map["Three"])

    for (item in map) {
        println("Key: ${item.key}, Value: ${item.value}")
    }
}
