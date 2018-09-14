import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < k; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			arr[r - 1][c - 1] = 1;
		}
		if (k % 2 == 1) {
			System.out.println("0");
		} else if (k == n * m) {
			System.out.println("-1");
		} else {
			System.out.println("1");
			int i = 0, j = 0;
			OUTER_LOOP:
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (arr[i][j] == 1) continue;
					else break OUTER_LOOP;
				}
			}
			i++;
			j++;
			System.out.println("" + i + " " + j);
		}
	}
}
