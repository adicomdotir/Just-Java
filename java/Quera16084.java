import java.util.Scanner;

public class Quera16084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean white = false;
		for (int i = 0; i < n; i++) {
			for (int x = 0; x < 3; x++) {
				for (int j = 0; j < n; j++) {
					if (x == 0 && i == 0) {
						System.out.print(" ");
						for (int k = 0; k < 5; k++) {
							System.out.print("_");
						}
						if (j == n - 1) {
							System.out.print(" ");
						}
					} else if (x == 0) {
						System.out.print("|");
						for (int k = 0; k < 5; k++) {
							System.out.print("_");
						}
						if (j == n - 1) {
							System.out.print("|");
						}
					} else {
						if (x == 2) {
							if (white) {
								System.out.print("|");
								for (int k = 0; k < 5; k++) {
									System.out.print("x");
								}
								if (j == n - 1) {
									System.out.print("|");
								}
							} else {
								System.out.print("|");
								for (int k = 0; k < 5; k++) {
									System.out.print(" ");
								}
								if (j == n - 1) {
									System.out.print("|");
								}
							}
							white = !white;
						} else {
							System.out.print("|");
							for (int k = 0; k < 5; k++) {
								System.out.print(" ");
							}
							if (j == n - 1) {
								System.out.print("|");
							}
						}
					}
				}
				System.out.println();
			}
			if (n % 2 == 0) {
				white = !white;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("|");
			for (int k = 0; k < 5; k++) {
				System.out.print("_");
			}
			if (i == n - 1) {				
				System.out.print("|");
			}
		}
		System.out.println();
	}

}