//SWEA_D3_1873_상호의배틀필드
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_1873_상호의배틀필드 {

	static int T;
	static int H;
	static int W;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			H = sc.nextInt();
			W = sc.nextInt();
			
			int nx = 0, ny = 0;
			String input;
			char[][] c = new char[H][W];
			for(int i = 0; i < H; i++)
			{
				input = sc.next();
				
				c[i] = input.toCharArray();
				for(int j = 0; j < W; j++)
				{
					
				}
			}
			
			int N = sc.nextInt();
			String str_move = sc.next();
			char[] c_move = new char[N];
			c_move = str_move.toCharArray();
			
			
			for(int i = 0; i < H; i++)
			{
				for(int j = 0; j < W; j++)
				{
					if(c[i][j] == '^')
					{
						nx = i;
						ny = j;
					}
					else if(c[i][j] == 'v')
					{
						nx = i;
						ny = j;
					}
					else if(c[i][j] == '<')
					{
						nx = i;
						ny = j;
					}
					else if(c[i][j] == '>')
					{
						nx = i;
						ny = j;
					}
				}
			}
			
			for(int i = 0; i < N; i++)
			{
				if (c_move[i] == 'S')
				{
//					c[nx][ny] 
				}
				else if (c_move[i] == 'U')
				{
					
				}
				else if (c_move[i] == 'D')
				{
					
				}
				else if (c_move[i] == 'L')
				{
					
				}
				else if (c_move[i] == 'R')
				{
					
				}
			}
			
		}
	}

}
