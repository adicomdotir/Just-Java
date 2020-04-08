import java.util.*;
public class Quera30884 {
    public static int[] empty = new int[7];
     public static void main(String []args) {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         sc.nextLine();
         String str = sc.nextLine();
         String[] arr = str.split("\\s+");
         for (int i = 0; i < arr.length; i++) {
             isEmpty(arr[i]);
         }
         
         n = sc.nextInt();
         sc.nextLine();
         str = sc.nextLine();
         arr = str.split("\\s+");
         for (int i = 0; i < arr.length; i++) {
             isEmpty(arr[i]);
         }
         
         n = sc.nextInt();
         sc.nextLine();
         str = sc.nextLine();
         arr = str.split("\\s+");
         for (int i = 0; i < arr.length; i++) {
             isEmpty(arr[i]);
         }
         
         System.out.println("" + countMethod());
     }
     
     public static void isEmpty(String str) {
         if (str.equals("shanbe")) empty[0] = 1;
         if (str.equals("1shanbe")) empty[1] = 1;
         if (str.equals("2shanbe")) empty[2] = 1;
         if (str.equals("3shanbe")) empty[3] = 1;
         if (str.equals("4shanbe")) empty[4] = 1;
         if (str.equals("5shanbe")) empty[5] = 1;
         if (str.equals("jome")) empty[6] = 1;
     }
     
     public static int countMethod() {
         int count = 0;
         
         for (int i = 0; i < empty.length; i++) {
             if (empty[i] == 0) count++;
         }
         return count;
     }
}
