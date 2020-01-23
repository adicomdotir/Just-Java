import java.util.*;
import java.lang.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seed = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String temp = "";
            for (int j = 0; j < m; j++) {
                seed = generateRandom(seed);
                if (j % 2 == 0) {
                    temp += createConsonantLetter(seed % 19);
                } else {
                    temp += createVowelLetter(seed % 5);
                }
            }
            System.out.print(" " + temp);
        }
    }
    
    private static int generateRandom(int seed) {
        return (445 * seed + 700001) % 2097152;
    }
    
    private static char createConsonantLetter(int index) {
        String letters = "bcdfghjklmnprstvwxz";
        return letters.charAt(index);
    }
    
    private static char createVowelLetter(int index) {
        String letters = "aeiou";
        return letters.charAt(index);
    }
}