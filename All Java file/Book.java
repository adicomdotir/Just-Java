public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this(name, authors, price);
		this.qty = qty;
	}

	public String getName() { return name; }
	public Author[] getAuthors() { return authors; }
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }
	public int getQty() { return qty; }
	public void setQty(int qty) { this.qty = qty; }

	@Override
	public String toString() {
		String str =  "Book[name=" + name + ",";
		for(Author a : authors) {
			str += a + ",";
		} 
		str += "price=" + price + ",qty=" + qty + "]";
		return str;
	}

	public String getAuthorNames() {
		String authorNames = "";
		for(Author a : authors) {
			authorNames += "," + a.getName();
		}
		return authorNames.substring(1);
	}
}