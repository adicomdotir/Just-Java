import java.util.*;
import java.lang.*;
import java.io.*;

class Quera17965 {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		long[] t = new long[k];
		
		for (int ii = 0; ii < n; ii++) {
		    a[ii] = sc.nextLong();
		    b[ii] = sc.nextLong();
		}
		for (int ii = 0; ii < k; ii++) {
		    t[ii] = sc.nextLong();
		}
	    
		for (int j = 0; j < k; j++) {
		    for (int i = 0; i < n; i++) {
		        if (t[j] >= a[i]) {
		            long temp = a[i];
		            a[i] = b[i];
		            b[i] = temp;
		        }
		    }
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
		    sum += a[i];
		}
		System.out.println("" + sum);
	}
}

