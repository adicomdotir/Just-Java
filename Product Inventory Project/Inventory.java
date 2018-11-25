import java.util.List;

public class Inventory {
    private int id;
    private List<Product> products;

    public Inventory(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }
    
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    
    public void addProduct(Product product) {
    	products.add(product);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }
    
	public int sumProducts() {
		int sum = 0;
		for(Product p: products) {
			sum += p.getPrice() * p.getQuantity();
		}
		return sum;
	}

    
}
