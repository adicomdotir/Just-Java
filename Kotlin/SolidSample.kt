fun main() {
    val emp = Employee()
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