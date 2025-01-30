import java.util.*;
import java.io.*;

class Main { 
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); // 패턴과 비교할 문자열 개수 입력
    String target = br.readLine(); // 패턴 입력 

    // "*" 을 기준으로 앞부분과 뒷부분을 나눔 (정규표현식에서 `\`는 escape 문자라 `\\*`로 사용)
    String[] str = target.split("\\*");

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++) {
      // 비교할 문자열 입력
      String word = br.readLine(); 

      // 최소 길이 검사 (앞부분과 뒷부분을 합친 길이보다 작으면 절대 매칭 불가능)
      if (word.length() < str[0].length() + (str.length > 1 ? str[1].length() : 0)) { 
        sb.append("NE\n");
        continue;
      }

      // 앞부분 체크
      String start = word.substring(0, str[0].length());

      // 뒷부분 체크 (뒷부분이 존재할 때만 실행)
      boolean endMatch = true;
      if (str.length > 1 && !str[1].isEmpty()) {
        String end = word.substring(word.length() - str[1].length());
        endMatch = end.equals(str[1]);
      }

      if (start.equals(str[0]) && endMatch) {
        sb.append("DA\n");
      } else {
        sb.append("NE\n");
      }
    }

    System.out.print(sb.toString());
  }
}
