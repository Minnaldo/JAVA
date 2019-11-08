import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 디저트카페_TEO {
    static int N;
    static int[][] arr;
    static int sr, sc;
    static int result;
    
    			   //우하,우상,좌상,좌하
    static int[] dx = { 1, 1, -1, -1 };
    static int[] dy = { 1, -1, -1, 1 };
    
    static BufferedReader br;
    static BufferedWriter bw;
    
    public static boolean inMap(int x, int y) {
    	return x >= 0 && x < N && y >= 0 && y < N;
    }
    
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            
            //map input
            arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            //디저트 먹을 수 없을 경우 -1로 시작.
            result=-1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sr = i;
                    sc = j;
                    // 좌표,방향,스탭
                    dfs(i, j, 0, 0, new boolean[101]);
                }
            }
            bw.write("#" + tc + " " + result);
            bw.write("\n");
            bw.flush();
        }
    }
    
    private static void dfs(int r, int c, int dir, int direction, boolean[] visit) {
        // 방향을 3번 꺾고, 다시 원래의 위치로 돌아왔다면  한바퀴 돌았다는것.
        if (direction > 3 && sr == r && sc == c) {
            result = Math.max(direction, result);
            return;
        }
        
        
        for (int i = dir; i < 4; i++) {
            int nr = r + dx[i];
            int nc = c + dy[i];
            //맵 밖으로 나가지 않고  내가 간 디저트카페의num와 같지 않다면
            if (inMap(nr, nc) && !visit[arr[nr][nc]]) {
                visit[arr[nr][nc]] = true;					//그 방문(visited) 배열을 true.
                //i가지고 가는게 중요! 현재 방향 그대로 들고가는거임
                dfs(nr, nc, i, direction + 1, visit);
                visit[arr[nr][nc]] = false;
            }else {
                continue;
            }
        }
    }
    
}