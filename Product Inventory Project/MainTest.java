import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		Product cpu = new Product(1,1500,5);
		Product dvd = new Product(2,200,9);
		Product cd = new Product(3,100,6);
		Product hdd = new Product(4,900,11);
		ArrayList<Product> list = new ArrayList<>();
		list.add(cpu);
		list.add(dvd);
		list.add(cd);
		list.add(hdd);
		Inventory inventory = new Inventory(1, list);
		inventory.removeProduct(hdd);
		System.out.println(inventory.sumProducts());
	}
}