import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 다리만들기2 {
	
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int N;
	static int M;
	static int count = 1;
	static int result;
	
	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x<N && y<M;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited=new boolean[N][M];
		
		map = new int[N+1][M+1];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(visited[i][j]==false&&map[i][j] == 1) {
					result++;
					map[i][j] = count;
					visited[i][j]=true;
					dfs(i,j);
					count++;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	static boolean[][] visited;
	
	private static void dfs(int x, int y) {
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(inMap(nx,ny) && map[nx][ny] == 1&&visited[nx][ny]==false) {
				visited[nx][ny]=true;
				map[nx][ny] = count;
				dfs(nx,ny);
			}
		}
	}

}
