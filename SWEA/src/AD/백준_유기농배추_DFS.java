package AD;

import java.util.Scanner;

public class 백준_유기농배추_DFS {

	static int T;
	static Scanner sc = new Scanner(System.in);
	static int M;
	static int N;
	static int K;
	static int[][] arr;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static boolean inArr(int x, int y)
	{
		return x>=0&&y>=0&&x<M&&y<N;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			arr = new int[N+2][M+2];
			for(int i = 0; i < K; i++)
			{
				int c = sc.nextInt();
				int r = sc.nextInt();
				arr[r+1][c+1] = 1;
				
			}
			
			int cnt = 0;
			for(int i = 1; i <= N; i++)
			{
				for(int j = 1; j <= M; j++)
				{
					if( arr[i][j] == 1)
					{
						cnt++;
						//인접한 모든 배추를 없는걸로 표시 (다시 세지 않도록..)
						dfs(i,j);
					}
				}
			}
			
			System.out.println(cnt);
		}
		
	}
	
	
	static void dfs(int x, int y)
	{
		//현재 좌표를 0으로 변경.
		arr[x][y] = 0;
		//사방에 대해서 1인경우,, 재귀호출.
		for(int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if( arr[nx][ny] == 1 )
			{
				dfs(nx, ny);
			}
		}
	}

}
