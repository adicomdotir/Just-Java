public class MyClass {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2 = new Circle(2.0, "Blue");
		System.out.println(c2);
		Rectangle r = new Rectangle();
		System.out.println(r);
		Employee e = new Employee(1, "Ali", "Hassani", 750);
		System.out.println(e);
		InvoiceItem i = new InvoiceItem("A001", "Battery", 6, 3.89);
		System.out.println(i);
		Account a = new Account("Account001", "Adicom", 7500);
		System.out.println(a);
		Time time = new Time(10,50,25);
		System.out.println(time);

		Author[] authors = {
			new Author("Adicom", "info@adicom.ir", 'm'),
			new Author("K112", "info@k112.ir", 'm')
		};
		Book book = new Book("Java", authors, 19.5);
		System.out.println(book);

		MyPoint myPoint = new MyPoint(5, 3);
		MyCircle myCircle = new MyCircle(myPoint, 5);
		System.out.println(myCircle);

		MyTriangle myTriangle = new MyTriangle(1,1,1,1,1,1);
		System.out.println(myTriangle);
		System.out.println(myTriangle.getType());

		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
		System.out.println("" + p1.evaluate(2));
	}
}
