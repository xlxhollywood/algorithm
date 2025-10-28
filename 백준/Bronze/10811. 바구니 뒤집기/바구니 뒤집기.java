import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 원소 개수와 반복 횟수 입력
        int count = sc.nextInt(); // ex: 5
        int N = sc.nextInt();     // ex: 2

        // 1~count까지 리스트 생성
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            arr.add(i);
        }

        // N번 반복해서 구간 입력받고 역순 처리
        for (int i = 0; i < N; i++) {
            int str = sc.nextInt(); // 시작 위치
            int fin = sc.nextInt(); // 끝 위치

            // 주의: subList의 끝 인덱스는 exclusive라서 +1 필요
            Collections.reverse(arr.subList(str - 1, fin));
        }

        // 결과 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}