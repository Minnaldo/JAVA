import java.util.Scanner;

public class 섬의개수_HONG {

	static int W;
	static int H;
	static int[][] map;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			W = sc.nextInt();
			H = sc.nextInt();
			
			if(W == 0 && H == 0)
				break;
			
			map = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int result = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(map[i][j] == 1) {
						result++;
						dfs(i, j);
					}
				}
			}
			System.out.println(result);
			
		}
	}
	
	static void dfs(int x, int y) {
		map[x][y] = 0;
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if( nx >= 0 && ny >= 0 && nx < H && ny < W) {
				if(map[nx][ny] == 1) {
					
					dfs(nx, ny);
					
				}
			}
		}
	}
	
	static int[] dx = {-1,1,0,0,-1,-1,1,1};
	static int[] dy = {0,0,-1,1,-1,1,-1,1};

}
