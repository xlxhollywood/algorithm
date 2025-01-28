import java.util.*;

// sc.nextLine() : 띄어쓰기까지 받기
// sc.next() : 토큰 단위
// br.readLine() : 띄어쓰기까지 받기
class Main {
  public static void main(String [] args) {
    /*
      1. 의상의 테스트 케이스 입력 받기.
      2. 의상의 개수 입력 받기
      3. 자료구조 Map 선언
      4. Map에 의상 종류를 key로 종류의 개수를 value로 입력 받기
      5. 경우의 수 계산하기
     */
    Scanner sc = new Scanner(System.in);

    // 테스트 케이스 입력
    int caseCount = sc.nextInt();


    for(int i = 0; i < caseCount; i++){
      // 의상의 종류 개수 입력
      int n = sc.nextInt();

      Map<String,Integer> map = new HashMap<>();
    
      for(int j = 0; j < n; j++){
        String name = sc.next(); // 의상 이름
        String type = sc.next(); // 의상 종류
        int count = map.getOrDefault(type, 0); // 기존 값 가져오기, 없다면 0
        map.put(type, count + 1); // 없는 경우 0 + 1, 있는 경우 n + 1이 된다.
      }

      // 경우의 수 계산
      int answer = 1;
      for(int value : map.values()){
        // 3C1 = 3. 2C1 = 2 --> 3C1 × 2C1 = 3 × 2 = 6
        // [headgear] : hat, turban, NULL = 2 + 1
        // [eyewear] : sunglasses, NULL = 1 + 1
        answer *= (value + 1);
      }

      // 모두 벗은 경우의 수는 제외 할 것.
      System.out.println(answer - 1);

  }

  }

}