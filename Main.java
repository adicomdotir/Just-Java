import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.text.MessageFormat;

/**
 * Brief summary of this class, ending with a period.
 *
 * It is common to leave a blank line between the summary and further details.
 * The summary (everything before the first period) is used in the class or package
 * overview section.
 *
 * The following inline tags can be used (not an exhaustive list):
 * {@link some.other.class.Documentation} for linking to other docs or symbols
 * {@link some.other.class.Documentation Some Display Name} the link's appearance can be
 * customized by adding a display name after the doc or symbol locator
 * {@code code goes here} for formatting as code
 * {@literal <>[]()foo} for interpreting literal text without converting to HTML markup
 * or other tags.
 *
 * Optionally, the following tags may be used at the end of class documentation
 * (not an exhaustive list):
 *
 * @author John Doe
 * @version 1.0
 * @since 5/10/15
 * @see some.other.class.Documentation
 * @deprecated This class has been replaced by some.other.package.BetterFileReader
 *
 * You can also have custom tags for displaying additional information.
 * Using the @custom.<NAME> tag and the -tag custom.<NAME>:htmltag:"context"
 * command line option, you can create a custom tag.
 *
 * Example custom tag and generation:
 * @custom.updated 2.0
 * Javadoc flag: -tag custom.updated:a:"Updated in version:"
 * The above flag will display the value of @custom.updated under "Updated in version:"
 *
 */
public class Main {


	/**
	 * Fields can be documented as well.
	 *
	 * As with other javadocs, the documentation before the first period is used as a
	 * summary, and is usually separated from the rest of the documentation by a blank
	 * line.
	 *
	 * Documentation for fields can use inline tags, such as:
	 * {@code code here}
	 * {@literal text here}
	 * {@link other.docs.Here}
	 *
	 * Field documentation can also make use of the following tags:
	 *
	 * @since 2.1.0
	 * @see some.other.class.Documentation
	 * @deprecated Describe why this field is outdated
	 */
	public int sampleField = 1;

	/**
	 * Brief summary of method, ending with a period.
	 *
	 * Further description of method and what it does, including as much detail as is
	 * appropriate. Inline tags such as
	 * {@code code here}, {@link some.other.Docs}, and {@literal text here} can be used.
	 *
	 * If a method overrides a superclass method, {@inheritDoc} can be used to copy the
	 * documentation
	 * from the superclass method
	 *
	 * @param stream Describe this parameter. Include as much detail as is appropriate
	 * Parameter docs are commonly aligned as here, but this is optional.
	 * As with other docs, the documentation before the first period is
	 * used as a summary.
	 *
	 * @return Describe the return values. Include as much detail as is appropriate
	 * Return type docs are commonly aligned as here, but this is optional.
	 * As with other docs, the documentation before the first period is used as a
	 * summary.
	 *
	 * @throws IOException Describe when and why this exception can be thrown.
	 * Exception docs are commonly aligned as here, but this is
	 * optional.
	 * As with other docs, the documentation before the first period
	 * is used as a summary.
	 * Instead of @throws, @exception can also be used.
	 *
	 * @since 2.1.0
	 * @see some.other.class.Documentation
	 * @deprecated Describe why this method is outdated. A replacement can also be specified.
	 */
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
}

class Print<T> {
	public void print(T t) {
		System.out.println("" + t);
	}
}