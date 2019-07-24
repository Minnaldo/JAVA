package Friday_Project_1WEEK;

import java.util.Scanner;

public class Building_BG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T;  tc++)
		{
			int N = sc.nextInt();
			char [][] input = new char[N][N];
			
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					input[i][j] = sc.next().charAt(0);
				}
			}
			
			
		}
	}

}
