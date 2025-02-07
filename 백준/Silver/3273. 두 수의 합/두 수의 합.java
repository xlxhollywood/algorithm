import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열 크기 입력
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 수열 입력
        }

        int x = sc.nextInt(); // 목표 합 입력
        Arrays.sort(arr); // O(n log n) 정렬

        int count = 0;
        int left = 0, right = n - 1;

        // O(n) 탐색 (두 개의 포인터로 최적화)
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) { // 찾았을 경우
                count++;
                left++;
                right--;
            } else if (sum < x) { // 합이 작으면 왼쪽 포인터 증가
                left++;
            } else { // 합이 크면 오른쪽 포인터 감소
                right--;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
