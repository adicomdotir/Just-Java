import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> numberCollection = new ArrayList<>();
		numberCollection.add(1320);
		numberCollection.add(1310);
		numberCollection.add(1275);
		numberCollection.add(1342);
		numberCollection.add(1336);
		numberCollection.add(1285);

		numberCollection.stream().filter((x) -> x > 1300).forEach(System.out::println);

		printLine();

		numberCollection.stream().map((x) -> x * 2).forEach(System.out::println);

		printLine();

		numberCollection.stream().map((x) -> x * 2).sorted().forEach(System.out::println);

		printLine();

		boolean anyMatch1336 = numberCollection.stream().anyMatch((x) -> x == 1336);
		System.out.println(anyMatch1336);      // true
		boolean allMatch1336 = numberCollection.stream().allMatch((x) -> x == 1336);
		System.out.println(allMatch1336);      // false
		boolean noneMatch1336 = numberCollection.stream().noneMatch((x) -> x == 1336);
		System.out.println(noneMatch1336);      // false

		printLine();

		long lowerThan1300 = numberCollection.stream().filter((s) -> s < 1300).count();
		System.out.println(lowerThan1300);    // 2

		printLine();

		Optional<Integer> reduced = numberCollection.stream().sorted().reduce((x, y) -> x + y);
		reduced.ifPresent(System.out::println);

		printLine();

		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("foo"));              // true
		System.out.println(predicate.negate().test("foo"));     // false
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
	}

	public static void printLine() {
		System.out.println("-----------------------");
	}
}