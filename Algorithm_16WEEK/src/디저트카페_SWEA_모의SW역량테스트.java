import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 디저트카페_SWEA_모의SW역량테스트 {

	static int T;
	static int N;
	static int sr;
	static int sc;
	static int[][] map;
	static boolean[] visited;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	static int[] dx = {1, 1, -1, -1};
	static int[] dy = {1, -1, -1, 1};
	
	static boolean inMap(int x, int y) {
		return x >=0 && x < N && y >= 0 && y < N;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			

			
			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					dfs(j, j, i, j, 0, 0);
				}
			}
			
			
		}
	}
	
	
	static void dfs(int sr, int sc, int r, int c, int dir, int cnt) {
		if(visited[map[r][c]])
			return;
		if(dir == 4)
			return;
		if(inMap(r, c)) {
			return;
		}
		
		visited[map[r][c]] = true;
		dfs(sr, sc, r+dx[dir], c+dy[dir], dir, cnt+1);
		dfs(sr, sc, r+dx[dir], c+dy[dir], dir+1, cnt+1);
		visited[map[r][c]] = false;
	}

}
