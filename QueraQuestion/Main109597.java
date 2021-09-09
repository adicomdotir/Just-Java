import java.util.*;

public class Main109597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String phone = sc.next();
            boolean isValid = false;
            isValid = fourRepeat(phone);
            if (!isValid) {
                 isValid = threeSequence(phone);
            }
            if (!isValid) {
                isValid = mirrorPhone(phone);
            }
            if (isValid) {
                System.out.println("Ronde!");
            } else {
                System.out.println("Rond Nist");
            }
        }
    }

    private static boolean fourRepeat(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            int cnt = 1;
            for (int j = i + 1; j < phone.length(); j++) {
                if (phone.charAt(i) == phone.charAt(j)) {
                    cnt += 1;
                }
                if (cnt >= 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean threeSequence(String phone) {
        for (int i = 0; i < phone.length() - 2; i++) {
            if (phone.charAt(i) == phone.charAt(i + 1) && phone.charAt(i + 1) == phone.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean mirrorPhone(String phone) {
        for (int i = 0; i < phone.length() / 2; i++) {
            if (phone.charAt(i) != phone.charAt(phone.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
 
