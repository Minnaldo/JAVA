package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D4_7699_수지의수지맞는여행 {

	static int T;
	static int R;
	static int C;
	static Scanner sc = new Scanner(System.in);
	static char[][] arr;
	static boolean[] visited;
	static int result;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	static boolean inArr (int x, int y)
	{
		return x >= 0 && y >= 0 && x < R && y < C;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			R = sc.nextInt();
			C = sc.nextInt();
			
			result = Integer.MIN_VALUE;
			arr = new char[R][C];
			
			for(int i = 0; i < R; i++)
			{
				arr[i] = sc.next().toCharArray();
			}
			
			for(int i = 0; i < R; i++)
			{
				for(int j = 0; j < C; j++)
				{
					visited = new boolean[26];
					cnt=0;
					cnt++;
					shoot(i, j);
					System.out.println("cnt 보쟈 "+cnt);
					result=Math.max(result, cnt);
				}
				
			}
			System.out.println("#"+tc+" "+result);
		}
	}
	
	
	static int cnt = 0;
	static void shoot(int x, int y)
	{
		
		for(int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if( inArr(nx, ny) && visited[arr[nx][ny]-'A'] == false)
			{
				visited[arr[nx][ny]-'A'] = true;
				cnt++;
				shoot(nx, ny);
//				visited[arr[nx][ny]-'A'] = false;
			}
		}
	}
}
