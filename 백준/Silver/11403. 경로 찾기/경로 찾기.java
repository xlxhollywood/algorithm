import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int atoi(String str){
        return Integer.parseInt(str);
    }
    static int rel[][];
    static int arr[][];
    static boolean visit[];
    static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = atoi(br.readLine());
        rel = new int[N+1][N+1];
        arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = atoi(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            //start시점마다 visit배열을 초기화
            visit = new boolean[N + 1];
            dfs(i);
            for (int j = 1; j <= N; j++) {
                if(visit[j]){
                    rel[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(rel[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void dfs(int start){
        for (int i = 1; i <= N; i++) {
            if(visit[i]) continue;
            if(arr[start][i] == 0) continue;
            visit[i] = true;
            dfs(i);
        }
    }
}