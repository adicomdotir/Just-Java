public class Main1 {
	public static void main(string[] args) {
		// Error S.O.L.I.D => DIP
	}
}

class Person {
	public void doWork() {}
}

class Work {
	Person person;
	
	public Work(Person person) {
		this.person = person;
	}
	
	public void working() {
		person.doWork();
	}
}