public class StringUtilImpl implements StringUtil {
	public int numberOfCharacters(String sentence) {
		if(sentence == null) return 0;
		else return sentence.length();
	}
}
