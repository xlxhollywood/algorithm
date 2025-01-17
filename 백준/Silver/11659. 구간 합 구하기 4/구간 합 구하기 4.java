import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int n = sc.nextInt(); // 수의 개수
        int m = sc.nextInt(); // 합을 구해야 하는 횟수
        int[] numbers = new int[n + 1]; // 1-based index 사용
        int[] prefixSum = new int[n + 1];

        // 수 입력
        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i - 1] + numbers[i]; // 누적합 계산
        }

        // 구간합 계산
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            sb.append(prefixSum[j] - prefixSum[i - 1]).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
        sc.close();
    }
}
