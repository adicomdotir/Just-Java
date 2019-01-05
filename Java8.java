public class Java8 {
	public static void main(String[] args) {
		Formula f = new Formula() {

		};
		System.out.println(f.print());
	}
}

interface Formula {
    default String print() {
        return "Default Method";
    }
} 