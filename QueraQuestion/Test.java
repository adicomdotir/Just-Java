public class Test {
	public static void main(String[] args) {
		Person x = new Student();
		x.talk(x);
	}
	
	
}

class Person {
   void talk(Person p) {
      System.out.print("Hi by person.");
   } 
}

class Student extends Person {
   void talk(Person s) {
      System.out.print("Hi by stud.");
   }
}
