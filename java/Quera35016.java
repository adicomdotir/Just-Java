import java.util.*;

public class Quera {

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         List<Integer> numbers = new ArrayList<>();
         List<Integer> weights = new ArrayList<>();
         for (int i = 1; i <= n; i++) {
             numbers.add(i);
             int x = sc.nextInt();
             weights.add(x);
         }
         
         while (numbers.size() > 1) {
             int w1 = weights.get(0);
             int w2 = weights.get(1);
             if (w1 > w2) {
                 weights.remove(1);
                 numbers.remove(1);
             } else {
                 weights.remove(0);
                 numbers.remove(0);
             }
         }
         System.out.println(numbers.get(0));
         
     }
}