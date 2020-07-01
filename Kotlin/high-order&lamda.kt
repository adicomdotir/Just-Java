fun main(args: Array<String>) {
    println(operation(3, 6, ::sum))
    println(operation(3, 6, { x, y -> y - x}))
	
    val op: (Int, Int) -> Int = { x, y -> x * y }
    println(operation(3, 6, op))
    
    val divade: (Int, Int) -> Int = { x, y -> y / x }
    println(operation(3, 6, divade))
    
    // Unanimous function
    println(operation(3, 6, fun(x: Int, y: Int): Int { return x * x * y }))
    
    println(newOp(5, {x -> x * 2}))

    // If High-Order has one parameter can use below signature
    println(newOp(5, {it * 2}))
        
    // If High-Order has last parameter can user below signature
    println(newOp(5) {
        it * 3
    })
    println(operation(3, 6) {
        x, y -> y / x
    })

    // Example for real state
    val db = Database()
    transaction(db) {
        // action
    }
}

class Database {
    fun commit()
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } catch(Exception e) {
        db.commit()
    }
}

fun newOp(x: Int, op:(Int) -> Int): Int {
    return op(x)
}

fun operation(x: Int, y: Int, op:(Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}