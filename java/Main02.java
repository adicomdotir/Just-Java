import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y2 = sc.nextInt();
		if (x < x1) System.out.println("Right");
		if (x > x1) System.out.println("Left");
	}
}
