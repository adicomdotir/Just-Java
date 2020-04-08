import java.util.Scanner;

public class Quera4065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int l = sc.nextInt();
		int time = 0;
		for (int i = 1; i <= l; i++) {
			if (i % 2 == 1) {
				time += a;
			} else {
				time += b;
			}
		}
		System.out.println("" + time);
	}
}
