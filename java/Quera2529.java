import java.util.*;

public class Quera2529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Character> list = new ArrayList<>();
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				if (j == 0) {
					list.add(str.charAt(j));
				} else {
					boolean is = false;
					for (int k = 0; k < list.size(); k++) {
						if (list.get(k) == str.charAt(j)) {
							is = true;
						}
					}
					if (!is) {
						list.add(str.charAt(j));
					}
				}
			}
			if (maxLen < list.size()) {
				maxLen = list.size();
			}
			list = new ArrayList<>();
		}
		System.out.println("" + maxLen);
	}
}
