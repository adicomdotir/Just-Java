import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] commands = new String[n];
		for (int i = 0; i < n; i++) {
			commands[i] = sc.nextLine();
		}
		commandDycript(commands);
	}
	
	public static void commandDycript(String[] commands) {
		Stack<String> stack = new Stack();
		String result = "";
		for (int i = 0; i < commands.length; i++) {
			String[] split = commands[i].split(" ");
			switch(split[0]) {
				case "insert": {
					int index = Integer.parseInt(split[1]) - 1;
					stack.push(result);
					String first = result.substring(0, index);
					String last = result.substring(index);
					result = first + split[2] + last;
					break;
				}
				case "delete": {
					int index = Integer.parseInt(split[1]) - 1;
					stack.push(result);
					String first = result.substring(0, index);
					String last = result.substring(index + 1);
					result = first + last;
				}
				case "undo": {
					result = stack.pop();
					break;
				}
			}
		}
		System.out.println(result);
	}
}