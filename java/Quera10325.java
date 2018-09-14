import java.util.Scanner;

public class Quera10325 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();

        if (x <= 10) {
            System.out.print("Right");
            System.out.print(" " + (10 - y + 1));
            System.out.print(" " + (1 + x - 1));
        } else {
            System.out.print("Left");
            System.out.print(" " + (10 - y + 1));
            System.out.print(" " + (20 - x + 1));
        }    
	}
}