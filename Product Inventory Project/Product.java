public class Product {
    private int id;
    private int price;
    private int quantity;

    public Product(int id, int price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(int id) { this.id = id; }
    public void setPrice(int price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getId() { return this.id; }
    public int getPrice() { return this.price; }
    public int getQuantity() { return this.quantity; }

    @Override
    public String toString() {
        return "[" + id + "," + price + "," + quantity + "]";
    }
}
