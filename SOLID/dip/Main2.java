public class Main2 {
	public static void main(string[] args) {
		// Fix S.O.L.I.D => DIP
	}
}

interface Worker {
	void doWork();
}

class Person implements Worker {
	@Override
	public void doWork() {}
}

class Work {
	Worker person;
	
	public Work(Worker person) {
		this.person = person;
	}
	
	public void working() {
		person.doWork();
	}
}