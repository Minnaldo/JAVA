package Baekjoon;

import java.util.Scanner;

public class 민_총잡이 {

	static int R = 0, C = 0;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int Column = sc.nextInt();
			int Row = sc.nextInt();
			
//			String str;
			char[][] map = new char[Column][Row];
			
			for(int i = 0; i < Column; i++)
			{
//				str = sc.nextLine();
				for(int j = 0; j < Row; j++)
				{
					
					map[i][j] = sc.next().charAt(0);
				}
			}
			
			for(int i = 0; i < Column; i++)
			{
				for(int j = 0; j < Row; j++)
				{
					if(map[i][j] == 'G')
					{
						
					}
				}
			}
		}
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