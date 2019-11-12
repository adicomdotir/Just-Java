import java.util.Scanner;

public class MyClass {
    static int lastIndex = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lastIndex = n - 1;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int index = findMax(numbers);
            if (numbers[lastIndex] < numbers[index]) {
                int temp = numbers[lastIndex];
                numbers[lastIndex] = numbers[index];
                numbers[index] = temp;
            }
            System.out.print(" " + index);
            lastIndex--;
        }

    }

    public static int findMax(int[] numbers) {
        int maxIndex = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if (numbers[maxIndex] < numbers[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}