import java.util.Scanner;

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
        int fib1 = 0, fib2 = 1;
        while (fib2 % number != 0) {
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
            index++;
        }
        return index;
    }
}