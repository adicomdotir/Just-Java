import java.util.*;

public class Quera51824 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            String temp = "";
            for (int j = 0; j < charArray.length; j++) {
                if (i > j) temp += charArray[i];
                else temp += charArray[j];
            }
            System.out.println(temp);
        }
    }
}
