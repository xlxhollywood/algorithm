import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        // sc.nextInt(); 호출 후 개행 문자(\n)가 입력 버퍼에 남아 있습니다.
        int n = sc.nextInt();
        // sc.nextLine();을 호출할 때 이 개행 문자를 읽어 버려서 첫 번째 word가 빈 문자열이 됩니다.
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            Stack<Character> s = new Stack<>();
            String word = sc.nextLine();

            for (int j = 0; j < word.length(); j++) {
                // 스택의 사이즈가 0이 아니고 top이 넣은 숫자와 같다면 pop한다.
                if (s.size() != 0 && s.peek() == word.charAt(j)) {
                    s.pop();
                } else {
                    // 입력 받은 알파벳을 하나씩 스택에 넣는다.
                    s.push(word.charAt(j));
                }
            }
            // 사이즈가 0이라면 좋은 단어 이므로 카운터를 올린다.
            if (s.size() == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
