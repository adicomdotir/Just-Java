import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		findMaximumSubSegment(arr);
	}
	
	public static void findMaximumSubSegment(int[] arr) {
	    int[] maximumSum = new int[arr.length];
	    int answer = Integer.MIN_VALUE;
	    maximumSum[0] = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        maximumSum[i] = Math.max(arr[i], arr[i] + maximumSum[i - 1]);
	    }
	    for (int i = 0; i < arr.length; i++) {
	        answer = Math.max(answer, maximumSum[i]);
	    }
	    System.out.println("" + answer);
	} 
}

import java.util.*;

public class code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("" + (calculate(n) % 1000000007));
	}
	
	public static long calculate(int n) {
	    long previousFib = 1; 
	    long currentFib = 1;
	    if (n == 1 || n == 0) {
	        return 1;
	    }
	    for (int index = 2; index <= n; index++) {
	        long tmp = previousFib + currentFib;
	        previousFib = currentFib;
	        currentFib = tmp;
	    }
	    return currentFib;
	}
}
