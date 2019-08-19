fun main(args: Array<String>) {
    // Simple Class
    val simpleClass = MyClass()
    simpleClass.printMe()

    // Nested Class
    val demo = Outer.Nested().foo()
    print(demo)

    // Inner Class

}

class MyClass {
    // property (data member)
    private var name: String = "Adicom Dot IR"
    
    // member function
    fun printMe() {
        print("You are at the best " + name)
    }
}

class Outer {
   class Nested {
      fun foo() = "Welcome to The My Test"
   }
}

class OuterOther {
    inner class NestedInner {
        fun foo() = "OK"
    }
}

/*
Anonymous Inner Class
Anonymous inner class is a pretty good concept that makes the life of a programmer very easy. Whenever we are implementing an interface, the concept of anonymous inner block comes into picture. The concept of creating an object of interface using runtime object reference is known as anonymous class. In the following example, we will create an interface and we will create an object of that interface using Anonymous Inner class mechanism.

Live Demo
fun main(args: Array<String>) {
   var programmer :Human = object:Human // creating an instance of the interface {
      override fun think() { // overriding the think method
         print("I am an example of Anonymous Inner Class ")
      }
   }
   programmer.think()
}
interface Human {
   fun think()
}
The above piece of code will yield the following output in the browser.

I am an example of Anonymous Inner Class 
Type Aliases
Type aliases are a property of Kotlin compiler. It provides the flexibility of creating a new name of an existing type, it does not create a new type. If the type name is too long, you can easily introduce a shorter name and use the same for future usage. Type aliases is really helpful for complex type. In the latest version, Kotlin revoked the support for type aliases, however, if you are using an old version of Kotlin you may have use it like the following −

typealias NodeSet = Set<Network.Node>
typealias FileTable<K> = MutableMap<K, MutableList<File>>
*/