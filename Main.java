import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.text.MessageFormat;

public class Main {

	public int sampleField = 1;
    
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

		printLine();

		printMessageFormat();

		printLine();

		// Functions
		// Function<String, String> func = (name) -> { return "Hello " + name; };
		Function<String, String> func = Main::myMethodRef;
		System.out.println(func.apply("Messi"));
		printLine();
		// Function<Rectangle, String> funcArea = (rect) -> { return rect.getArea(); };
		Function<Rectangle, String> funcArea =  Rectangle::getArea;
		System.out.println(funcArea.apply(new Rectangle(5, 4)));

		printLine();

		// Suppliers
		Supplier<Rectangle> rectangleSupplier = Rectangle::new;
		// Supplier<Rectangle> rectangleSupplier = () -> {return new Rectangle(5, 6);};
		System.out.println(rectangleSupplier.get().getArea());

		printLine();

		// Consumers
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
		greeter.accept(new Person("Ali", "Ghorbani"));

		printLine();

		// Comparators
		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");
		comparator.compare(p1, p2);             // > 0
		comparator.reversed().compare(p1, p2);  // < 0

		printLine();

		// Optionals
		Optional<String> optional = Optional.of("adicom");
		optional.isPresent(); // null or other
		optional.get();
		optional.orElse("fallback");
		optional.ifPresent((s) -> System.out.println(s.charAt(0)));

		printLine();

		Stream<String> stream = Stream.of("apple", "tomato", "potato", "orange", "kiwi");
		stream.filter(s -> s.contains("a"))
			.map(s -> s.toUpperCase()) // .map(String::toUpperCase())
			.sorted()
			.forEach(s -> System.out.println(s)); // .forEach(System.out::println)


		printLine();

		IntStream naturalNumbers = IntStream.iterate(1, x -> x + 1);
		naturalNumbers.limit(5).forEach(System.out::println);

		printLine();

		Print<String> pr1 = new Print<>();
		pr1.print("Hello Generic");
		Print<Integer> pr2 = new Print<>();
		pr2.print(150);
		Print<Float> pr3 = new Print<>();
		pr3.print(1.5F);
		Print<Person> pr4 = new Print<>();
		pr3.print(new Person("Yashar", "Panahi"));
	}

	public static void printLine() {
		System.out.println("-----------------------");
	}

	public static void printMessageFormat() {
		MessageFormat mf = new MessageFormat("String: {0}\nInteger: {1}\nDouble: {2}");
        Object[] objArray = {"This is a string", new Integer(56), new Double(12.34)};
        System.out.println(mf.format(objArray));
	}

	public static String myMethodRef(String name) { 
		return "Hello " + name;
	}

	public static void primeNumberWithStream() {
		IntStream.range(1, 99).filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}

class Rectangle {
	private int x, y;

	public Rectangle() {
		this(2, 2);
	}

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getArea() {
		return "Area is = " + ((x + y) * 2);
	}
}


class Singleton {
	private static Singleton mSingleton = null;

	private Singleton() {}

	public static Singleton getInstacne() {
		if (mSingleton == null) {
			mSingleton = new Singleton();
		}

		return mSingleton;
	}
}

interface Bank {
	void saveRial(int price);
}

class MelliBank implements Bank {
	@Override
	public void saveRial(int price) {
		System.out.println("" + price);
	}
}

class SepahBank implements Bank {
	@Override
	public void saveRial(int price) {
		System.out.println("" + price);
	}
}

class Gold {
	public int count;
}

class GoldAdepter implements Bank {
	@Override
	public void saveRial(int price) {
		
	}
}

class Person {
	public String firstName;
	public String lastName;

	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return "[" + firstName + ", " + lastName + "]";
}

class Print<T> {
	public void print(T t) {
		System.out.println("" + t);
	}
}