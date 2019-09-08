package Baekjoon;

import java.util.Scanner;

public class 색종이2_민_레츠기릿 {

	static int N;
	static Scanner sc = new Scanner(System.in);
	static int num1;
	static int num2;
	static char[][] arr;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static boolean inArr(int x, int y)
	{
		return x >= 0 && y >= 0 && x <= 101 && y <= 101;
	}
	
	public static void main(String[] args) {
		N = sc.nextInt();
		arr = new char[102][102];
		for(int tc = 1; tc <= N; tc++)
		{
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			
			for(int i = num2; i < num2 + 10; i++)
			{
				for(int j = num1; j < num1 + 10; j++)
				{
					arr[i][j] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i = 1; i <= 100; i++)
		{
			for(int j = 1; j <= 100; j++)
			{
				if(arr[i][j] == 1)
				{
					result += shoot(i, j);
				}
			}
		}
		
		System.out.println(result);
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
			
			if( inArr(nx, ny) && (arr[nx][ny] == 0))
			{
				cnt++;
			}
			
//			nx += dirX;
//			ny += dirY;
		}
		
		return cnt;
	}
}
