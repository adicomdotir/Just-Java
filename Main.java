import java.util.*;

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
		numberCollection.stream().map((x) -> x *2).forEach(System.out::println);
		printLine();
		numberCollection.stream().map((x) -> x *2).sorted().forEach(System.out::println);
		printLine();
		boolean anyMatch1336 = numberCollection.stream().anyMatch((x) -> x == 1336);
		System.out.println(anyMatch1336);      // true
		boolean allMatch1336 = numberCollection.stream().allMatch((x) -> x == 1336);
		System.out.println(allMatch1336);      // false
		boolean noneMatch1336 = numberCollection.stream().noneMatch((x) -> x == 1336);
		System.out.println(noneMatch1336);      // false
	}

	public static void printLine() {
		System.out.println("-----------------------");
	}
}