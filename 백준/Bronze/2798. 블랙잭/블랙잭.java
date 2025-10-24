import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 카드 개수
    int m = sc.nextInt(); // 목표 합
    List<Integer> card = new ArrayList<>();

    // 카드 입력
    for (int i = 0; i < n; i++) {
      card.add(sc.nextInt());
    }

    int result = 0; // 현재까지 찾은 최대합 (M 이하)

    // 3중 반복문으로 모든 3장 조합 탐색
    for (int i = 0; i < card.size() - 2; i++) {
      for (int j = i + 1; j < card.size() - 1; j++) {
        for (int k = j + 1; k < card.size(); k++) {
          int sum = card.get(i) + card.get(j) + card.get(k);

          // M 이하이면서, 현재까지의 result보다 크면 갱신
          if (sum <= m && sum > result) {
            result = sum;
          }
        }
      }
    }

    System.out.println(result);
  }
}