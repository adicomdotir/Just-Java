import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	List<Car> list = new ArrayList<>();
    	list.add(new Car("Blue", 11000));
    	list.add(new Car("Blue", 15000));
    	list.add(new Car("Red", 13500));
    	list.add(new Car("Green", 12000));
    	list.add(new Car("Blue", 16000));
    	list.add(new Car("Black", 15500));
    	list.add(new Car("Blue", 12000));
    	list.add(new Car("Green", 9000));
    	
    	list.stream()
    	.filter(a->"Blue".equals(a.color))
    	.sorted((a,b)->b.price-a.price)
    	.limit(2)
    	.forEach(a->System.out.println(a));

		MyPolynomial myPoly = new MyPolynomial(1, 1, 2);
        System.out.println(myPoly);
        myPoly.add(new MyPolynomial(1, 1, 2));
		System.out.println(myPoly);
		
        System.out.println(new MyTime(7,5,1));

		System.out.println(new MyDate(2017, 4, 28));
    }
}

class Car {
	public String color;
	public int price;
	public Car(String c, int p) {
		this.color = c;
		this.price = p;
	}
	@Override
	public String toString() {
		return "Color:" + color + " Price:" + price;
	};
}
