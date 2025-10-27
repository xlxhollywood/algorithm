import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String pword = sc.nextLine();

            // 종료 조건
            if (pword.equals("0")) {
                break;
            }

            boolean isPalindrome = true; // 기본값 true

            for (int i = 0; i < pword.length() / 2; i++) {
                if (pword.charAt(i) != pword.charAt(pword.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}