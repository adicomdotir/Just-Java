import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(fib() + "");
	}
	
	public static BigInteger fib() {
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		for (int i = 3; i <= 100; i++) {
			
			BigInteger temp = a.add(b);
			a = b;
			b = temp;
		}
		return b;
	}
}