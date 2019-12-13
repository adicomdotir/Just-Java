import java.util.ArrayList;
import java.util.List;

public class Question01 {
	public static void main(String[] args) {
		List<Integer> mList = new ArrayList<>();
		mList.add(1);
		mList.add(10);
		mList.add(100);
		System.out.println(sumWithFor(mList) + "");
		System.out.println(sumWithWhile(mList) + "");
		System.out.println(sumWithRec(mList) + "");
	}
	
	public static int sumWithFor(List<Integer> list) {
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		return sum;
	}
	
	public static int sumWithWhile(List<Integer> list) {
		int sum = 0;
		int index = list.size();
		while (index > 0) {
			sum += list.get(index - 1);
			i--;
		}
		return sum;
	}
	
	public static int sumWithRec(List<Integer> list) {
		if (list.size() == 0) return list.get(0);
		else {
			return sumWithRec(list.subList(1, list.size() - 1)) + list.get(0);
		}
	}
}
