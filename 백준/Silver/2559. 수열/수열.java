import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n: 배열의 크기, k: 연속된 수의 개수
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] psum = new int[n + 1]; // 부분합 배열
        int ret = Integer.MIN_VALUE; // 최대값을 저장할 변수

        // 입력을 받아 부분합 배열 계산
        for (int i = 1; i <= n; i++) {
            int temp = sc.nextInt(); // 현재 입력 값
            psum[i] = psum[i - 1] + temp; // 누적합 계산
        }

        // 연속된 k개의 합 중 최대값 계산
        for (int i = k; i <= n; i++) {
            ret = Math.max(ret, psum[i] - psum[i - k]); // i에서 k개 이전까지의 합
        }

        // 결과 출력
        System.out.println(ret);

        sc.close();
    }
}
