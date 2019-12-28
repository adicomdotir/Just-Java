import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Object> mList1 = new ArrayList<>();
		mList1.add(1);
		mList1.add(10);
		mList1.add(100);
		List<Object> mList2 = new ArrayList<>();
		mList2.add("A");
		mList2.add("B");
		mList2.add("C");
		mergeList(mList1, mList2);
	}
	
	public static List<Object> mergeList(List<Object> list1, List<Object> list2) {
		List<Object> temp = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			temp.add(list1.get(i));
			temp.add(list2.get(i));
		}
		return temp;
	}
}