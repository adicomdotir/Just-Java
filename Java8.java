public class Java8 {
	public static void main(String[] args) {
		Formula f = new Formula() {};
		System.out.println(f.print());

		
		// Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123
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

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}