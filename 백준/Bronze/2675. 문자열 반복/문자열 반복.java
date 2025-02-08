import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      int opp = sc.nextInt(); // 3 입력
      String word = sc.next(); // 공백 기준으로 문자열을 읽음

      for(int k = 0 ; k < word.length(); k++){ // 문자수 길이 만큼 반복 
        for(int j = 0; j < opp; j++){
          System.out.print(word.charAt(k)); // AAABBBCCC 
        }
      }
      System.out.println();

    }


  }
}