import java.util.Scanner;
 
/*
 	정올 - 해밀턴순환회로   ->  최적경로 문제와 비슷하다.
 */

public class 해밀턴순환회로 {
    static int N;
    static int[][] adj;
    static boolean[] visited;
    static int min = 987654321;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        adj = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++)
                adj[i][j] = sc.nextInt();
        }
        visited = new boolean[N];
        dfs(0, 0, 1);
        System.out.println(min);
    }
    static void dfs(int node, int cost, int cnt) {
        if(cost > min)
            return;
        if(cnt == N ) {
            if( adj[node][0] != 0 ) {
                min = Math.min(min, cost + adj[node][0]);
            }
            return;
        }
         
        for(int i = 0; i < N; i++) {
            if( !visited[i] && adj[node][i] != 0 ) {
                visited[i] = true;
                dfs(i, cost + adj[node][i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}