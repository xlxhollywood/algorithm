import java.util.*;

class Main {
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    // 테스트 케이스 입력
    int T = sc.nextInt();

    for(int tc = 1; tc <= T; tc++){
      // 의상의 종류 개수 입력
      int n = sc.nextInt();

      //의상 종류별 개수를 저장할 Map 생성
      Map<String,Integer> map = new HashMap<>();

      // 의상 이름과 종류 입력 및 Map에 저장
      for(int i = 0; i < n; i++){
        String name = sc.next(); // 의상 이름
        String type = sc.next(); // 의상 종류
        int count = map.getOrDefault(type, 0); // 기존 값 가져오기
        map.put(type, count + 1); // 업데이트된 값 저장
      }

      // 가능한 모든 경우의 수를 계산한다.
      int ans = 1;
      for(int val : map.values()){
        ans *= val + 1;
      }

      // 모두 다 벗는 경우의 수는 제이
      System.out.println(ans - 1); 

    }
  }

}