package SWEA;

import java.util.Scanner;

public class SWEA_1861_정사각형방 {

	static int T;
	static int N;
	static Scanner sc = new Scanner(System.in);
	static int[][] arr;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static int result;	
	static int resultNum;
	
	static boolean inArr (int x, int y)
	{
		return x >= 0 && y >= 0 && x < N && y < N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			arr = new int[N+1][N+1];
			result = Integer.MIN_VALUE;	//-2147483648
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			resultNum = Integer.MAX_VALUE;	//2147483647
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					cnt = 1;
					shoot(i, j);
					if(result < cnt)
					{
						resultNum = arr[i][j];
						result = cnt;
					}
					else if(result == cnt && resultNum > arr[i][j])
					{
						resultNum = arr[i][j];
					}
					
				}
			}
			System.out.println("#" + tc + " " + resultNum + " " + result);
		}
	}
	
	static int cnt = 0;
	static void shoot(int x, int y)
	{
		int nx = x;
		int ny = y;
		
		for(int i = 0; i < 4; i++)
		{
			int dirX = dx[i];
			int dirY = dy[i];
			
			nx = x + dirX;
			ny = y + dirY;
			
			if( inArr(nx, ny) && (arr[nx][ny]-arr[x][y] == 1))
			{
				cnt++;
				shoot(nx, ny);
			}
		}
		
	}

}
