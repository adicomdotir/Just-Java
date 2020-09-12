import java.util.*;

public class Quera19995 {
    public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    String word = sc.next();
	    for (int i = 0; i < word.length(); i++) {
	        String temp = "";
	        for (int j = 0; j < i; j++) {
	            temp += word.charAt(i);
    	    }
    	    System.out.println(temp + word.substring(i));
	    }
    }
} 
