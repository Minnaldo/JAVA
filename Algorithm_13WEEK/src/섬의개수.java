import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 섬의개수 {

	static int[][] map;
					//상, 좌상, 우상, 우,우하, 하,좌하,좌
	static int[] dx = {-1, -1, 1, 0, 1, 1, -1, 1};
	static int[] dy = {0, -1, -1, 1, 1, 0, 1, -1};
	
	static int result;
	static int h;
	static int w;

	static boolean inMap(int x, int y) {
		return x >= 0 && y >= 0 && x < h && y < w;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(h == 0 && w == 0)
				return;
			
			map = new int[h][w];
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			result = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == 1) {
						result++;
						map[i][j] = -1;
						dfs(i, j);	//이동 가능 1, 이미 방문 -1, 못 지나가 0
					}
				}
			}
			System.out.println(result);
		}
		
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(inMap(nx,ny) && map[nx][ny] == 1) {
				map[nx][ny] = -1;
				dfs(nx,ny);
			}
		}
		
	}
	
	

}
