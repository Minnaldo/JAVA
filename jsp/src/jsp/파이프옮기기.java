package jsp;

import java.util.Scanner;

public class 파이프옮기기 {
	static int N;
	static boolean[][] map;
	static int[][][] memo;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		memo = new int[N][N][3];
		map = new boolean[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				map[i][j] = sc.nextInt() == 0 ? true : false;
			}
		}
		System.out.println(dfs(1,0,0));
		
	}
	
	static long dfs(int x, int y, int dir)
	{
		long result = memo[y][x][dir];
		if(result != 0) return result;
		if(x== N-1 && y == N-1)
		{
			return 1;
		}
		//가로
		if(dir == 0)
		{
			if(x+1 < N && map[y][x+1]) {
				result += dfs(x+1,y,0);
			}
			if(x+1<N && y+1<N && map[y+1][x] &&
					map[y+1][x+1] && map[y][x+1])
			{
				result += dfs(x+1, y+1, 2);
			}
		}
		else if(dir == 1) {
			if(y+1<N && map[y+1][x]) {
				result += dfs(x,y+1, 1);
			}
			if(x+1<N && y+1<N && map[y+1][x] &&
					map[y+1][x+1] && map[y][x+1])
			{
				result += dfs(x+1, y+1, 2);
			}
			
		}
		else {
			if(x+1 < N && map[y][x+1]) {
				result += dfs(x+1,y,0);
			}
			if(y+1<N && map[y+1][x]) {
				result += dfs(x,y+1, 1);
			}
			if(x+1<N && y+1<N && map[y+1][x] &&
					map[y+1][x+1] && map[y][x+1])
			{
				result += dfs(x+1, y+1, 2);
			}
		}
		//이 시점에서 현재 좌표와 방향에 대해서 result가지의 경우의 수를 저장한다.
		
		memo[y][x][dir]= (int) result;
		return result;
		
	}
}
