import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt();
		int n = d;
		while (n % p > p / 2) {
			n += d;
		}
		System.out.println("" + n);
	}
}
