import java.util.*;
import java.lang.*;
import java.io.*;

public class Ideone {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int R = sc.nextInt();
		int L = sc.nextInt();
		double r = R / 100.0 / 12;
		double pow = Math.pow(1 + r, L);
		double M = (r * pow);
		M = M / (pow - 1);
		M = P * M;
		System.out.println("" + (int) Math.ceil(M));
	}
}