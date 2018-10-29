import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            String temp = new String();
            int divide = 2;
            while(number != 1) {
                while (number % divide != 0) divide++;
                number /= divide;
                temp += divide + "*";
                divide = 2;
            }
            System.out.println(temp.substring(0, temp.length() - 1));
        }
    }
} 