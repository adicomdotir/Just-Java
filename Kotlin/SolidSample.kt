fun main() {
    val emp = Employee()
	val num: Int = 5
    emp.run()
    val other: Other = Other(emp)
}

interface Runner {
    fun run()
}

interface Person {
    fun print()
}

class Employee : Person, Runner {
    override fun print() {
    	println("I am Employee")
	}
    
    override fun run() {
    	println("Employee speed is 20 km")
	}
}

class Student : Person, Runner {
    override fun print() {
    	println("I am Student")
	}
    
    override fun run() {
    	println("Student speed is 40 km")
	}
}

class Other {
    constructor(p: Person) {
        p.print()
    }
}

/*
Single responsibility principle
    A class should have one, and only one, reason to change.
*/

class Robot(val name: String, val type: String) {
    fun greet() {
        println("Hello my name is $name, and I am a $type robot")
    }
}