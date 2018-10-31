import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int d = (int) (Math.pow(b, 2) - 4 * a * c);
            if (d < 0) {
                d = (int) Math.sqrt(-d);
                result += (-b / (2 * a)) + "+" + (d / (2 * a)) + "i " + (-b / (2 * a)) + "-" + (d / (2 * a))+ "i; ";
            } else {
                d = (int) Math.sqrt(d);
                int x1 = (-b + d) / (2 * a);
                int x2 = (-b - d) / (2 * a);
                result += x1 + " " + x2 + "; ";
            }
        }
            System.out.println(result.substring(0, result.length() - 2));
    }    
}