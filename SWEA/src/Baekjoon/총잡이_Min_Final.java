package Baekjoon;

import java.util.Scanner;

public class 총잡이_Min_Final {

	static int T;
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int M;
	static char[][] arr;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	///////////////////////
	static boolean inArr (int x, int y)
	{
		return x >= 0 && y >= 0 && x < N && y < M;
	}

	
	public static void main(String[] args) {
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			
			arr = new char[N][M];
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < M; j++)
				{
					arr[i][j] = sc.next().charAt(0);
				}
			}
			
			int result = 0;
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < M; j++)
				{
					if(arr[i][j] == 'G') {
						result += shoot(i, j);
					}
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
	
	static int shoot(int x, int y)
	{
		int cnt = 0;
		int nx = x;
		int ny = y;
		
		for(int i = 0; i < 4; i++)
		{
			int dirX = dx[i];
			int dirY = dy[i];
			
			nx = x + dirX;
			ny = y + dirY;
			
			while( inArr(nx, ny) && (arr[nx][ny] != 'W'))
			{
				if(arr[nx][ny] == 'G')
					break;
				if(arr[nx][ny] == 'T')
				{
					cnt++;
					arr[nx][ny] = 'A';
					break;
				}
				nx += dirX;
				ny += dirY;
			}
			
			
		}
		
		return cnt;
	}
}


/*
2
5 7
T 0 T 0 G 0 G
0 W T W W W 0
T W G 0 T W T
0 0 0 T G W 0
0 0 T 0 0 W 0
2 10
T W 0 G 0 W 0 G 0 W
G 0 T W T 0 T W T 0
 */