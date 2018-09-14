
public class RepeatInString {

	public int StringInString(String one, String two) {
		if (one == null || two == null) return 0;
		if (one.length() == 0 || two.length() == 0) return 0;
		int len = two.length();
		int count = 0;
		for (int i = 0; i <= one.length() - len; i++) {
			if (one.substring(i, i + len).equals(two)) count++;
		}
		return count;
	}
}