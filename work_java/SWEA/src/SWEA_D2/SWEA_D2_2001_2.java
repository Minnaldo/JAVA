//SWEA_D2_2001. 파리 퇴치
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_2001_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			int sum = 0, max = 0;
			for(int i = 0; i < N-M+1; i++)
			{
				for(int j = 0; j < N-M+1; j++)
				{
					sum = 0;
					
					for(int k = 0; k < M; k++)
					{
						for(int l = 0; l < M; l++)
						{
							sum += arr[i+k][j+l];
						}
					}
					
					if(max < sum)
						max = sum;
				}
			}
			
			System.out.println("#" + tc + " " + max);
			
		}

	}

}
