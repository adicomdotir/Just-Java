import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] first = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        int initFirst = sc.nextInt();
        int initEnd = sc.nextInt();
        
        boolean support = false;
        for(int i = initFirst; i <= initEnd; i++) {
            boolean[] localSupport = new boolean[n];
            for(int j = 0; j < n; j++) {
                localSupport[j] = checkArea(i, first[j], end[j]);
            }
            support = hasTrue(localSupport);
            if (support == false) {
                break;
            }
        }
        System.out.print("" + support);
    }
    
    public static boolean checkArea(int i, int j, int k) {
        return i >= j && i <= k;
    }
    
    public static boolean hasTrue(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                return true;
            }
        }
        return false;
    }
}
