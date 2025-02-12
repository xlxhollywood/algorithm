import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited; // 방문 여부 체크 배열

    static void dfs(int idx) {
        visited[idx] = true; // 방문했으므로 true 체크
        
        for (int there : adj.get(idx)) {
            if (!visited[there]) { // 방문하지 않았다면 DFS 진행
                dfs(there);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점 개수
        int m = sc.nextInt(); // 간선 개수
        int cnt = 0; // 연결 요소 개수

        // 인접 리스트 초기화
        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        visited = new boolean[n + 1]; // 방문 배열 초기화

        // 간선 입력 받기
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // 무방향 그래프
        }

        // DFS를 사용하여 연결 요소 개수 구하기
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // 방문하지 않았다면 새로운 연결 요소 발견
                cnt++;
                dfs(i);
            }
        }

        // 연결 요소 개수 출력
        System.out.println(cnt);
    }
}
