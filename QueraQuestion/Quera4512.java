import java.util.Scanner;

public class Quera4512 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int index = 0;
		boolean isFirstSentences = true;
		// temp = "Sir Daniel Michael Blake Day-Lewis (born 29 April 1957) is an English actor who holds both British and Irish citizenship. Born and raised in London, he excelled on stage at the National Youth Theatre, before being accepted at the Bristol Old Vic Theatre School, which he attended for three years.";
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ' || i == temp.length() - 1) {
				if (temp.charAt(index) >= 'A' && temp.charAt(index) <= 'Z') {
					if (isFirstSentences == false) {
						if (temp.charAt(i - 1) == ',') {
							System.out.println(temp.substring(index, i - 1));
						} else {
							System.out.println(temp.substring(index, i));
						}
					}
				}
				isFirstSentences = false;
				index = i + 1;
			} else if (temp.charAt(i) == '.' || temp.charAt(i) == '?') {
				index = i + 1;
				isFirstSentences = true;
			}
		}
	}
}

