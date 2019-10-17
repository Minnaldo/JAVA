import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 아기상어 {

	static int N;
	static int[][] map;
	
	static int baby_shark_size = 2;
	static int baby_shark_size_cnt = 0;
	
	static int result;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static boolean inMap(int x, int y) {
		return x>=0 && y>=0 && x < N && y < N;
	}
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 9) {
					result += DFS(i, j);
				}
			}
		}
		
		bw.write(result +"");
		bw.flush();
	}
	
	static int DFS(int x, int y) {
		int cnt = 0;
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(inMap(nx,ny) && map[nx][ny] <= baby_shark_size) {
				if(map[nx][ny] == 0 && map[nx][ny] == baby_shark_size) {
					cnt++;
				}
				else if(map[nx][ny] != 0 && map[nx][ny] < baby_shark_size) {	//0이 아니고 아기상어크기보다 작은수라면
					cnt++;
					baby_shark_size_cnt++;						//아기상어크기카운트증가
					if(baby_shark_size_cnt == baby_shark_size)	//아기상어카운트
						baby_shark_size++;
					map[nx][ny] = 0;
					
				}
			}
		}
		return cnt;
	}

}
