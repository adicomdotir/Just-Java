import java.util.*;

public class Quera35028 {

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.nextLine();
         String houses = sc.nextLine();
         int s = sc.nextInt();
         int t = sc.nextInt();
         char[] charArray = houses.toCharArray();
         int count = 0;
         int max = 0;
         if (s > t) {
             int temp = s;
             s = t;
             t = temp;
         }
         
         for (int i = s - 1; i <= t - 1; i++) {
             if (charArray[i] == 'H') {
                 count++;
             } else if (charArray[i] == 'P') {
                 max += oneInBits(count);
                 count = 0;
             }
         }
         System.out.println(max + "");
         
     }
     
     public static int oneInBits(int n) {
         return Integer.bitCount(n);
     }
}
