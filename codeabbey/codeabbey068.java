import java.util.Scanner;
import java.math.BigInteger; 

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int index = findIndex(numbers[i]);
            System.out.print(" " + index);
        }

    }

    public static int findIndex(int number) {
        int index = 1;
        BigInteger fib1 = BigInteger.valueOf(0), fib2 = BigInteger.valueOf(1);
        while (fib2.remainder(BigInteger.valueOf(number)) != BigInteger.valueOf(0)) {
            BigInteger temp = fib1.add(fib2);
            fib1 = fib2;
            fib2 = temp;
            index++;
        }
        return index;
    }
}