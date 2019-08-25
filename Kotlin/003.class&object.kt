fun main(args: Array<String>) {
   // Simple Class
   val simpleClass = MyClass()
   simpleClass.printMe()

   // Nested Class
   val demo = Outer.Nested().foo()
   print(demo)

   // Inner Class
   val demo2 = OuterOther().NestedInner().foo()
   println(demo2)

   // Anonymous Inner Class
   var programmer :Human = object:Human {
      override fun think() { 
         print("I am an example of Anonymous Inner Class ")
      }
   }
   programmer.think()
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

interface Human {
   fun think()
}