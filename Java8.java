public class Java8 {
	public static void main(String[] args) {
		Formula f = new Formula() {};
		System.out.println(f.print());
	}
}

interface Parent {
	default String print() {
        return "Parent Default Method";
    }
}
interface Formula extends Parent {
    default String print() {
        return "Formula Default Method";
    }
} 