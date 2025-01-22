import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용해 입력 값을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 문자열 한 줄을 입력받음 (예: "AABBCC")
        String line = br.readLine();
        int[] alpha = new int[26];
      
        for (int i = 0; i < line.length(); i++) { 
            alpha[line.charAt(i) - 'A']++;
        }
        
        int isOdd = 0;
        // 홀수인 알파벳이 몇 개 인지 체크
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 != 0) {
                isOdd++;
            }
        }

        // 결과를 담을 문자열
        String answer = "";
        

        // 홀수 개수를 가진 알파벳이 2개 이상이라면 팰린드롬 생성 불가
        if (isOdd > 1) {
            answer = "I'm Sorry Hansoo";
        } else {
            // 팰린드롬의 앞 부분(반)을 만든다.
            for (int i = 0; i < alpha.length; i++) {
                // 각 알파벳 개수의 절반만큼을 앞쪽에 배치 , 단 알파벳의 개수가 한 개일 경우에는 반복문 들어가지 않음. 예: 입력 "AABBCC"라면 sb = "ABC"  ABCCBA
                for (int r = 0; r < alpha[i] / 2; r++) {
                    sb.append((char)(i + 'A'));
                }
            }
            // answer에 일단 앞쪽 절반을 붙여넣고
            answer += sb.toString();

            // end에는 앞 부분을 뒤집은 문자열(즉 뒤쪽 절반이 될 부분)을 저장. 예) end = "CBA"
            String end = sb.reverse().toString();
          
            // 새로운 객체로 초기화
            sb = new StringBuilder();
            // 홀수(1,3,5) 번 등장하는 알파벳(딱 1개만 존재 가능)을 중간에 배치
            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] % 2 == 1) {
                    sb.append((char)(i + 'A'));
                }
            }

            // 가운데 문자(홀수 개 알파벳) + 뒤쪽 절반을 순서대로 붙여 완성. 예: answer = "ABC" + "" + "CBA" = "ABCCBA"
            answer += sb.toString() + end;
            
        }

        System.out.println(answer);
    }
}
