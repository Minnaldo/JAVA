//SWEA_D2_1979. 어디에 단어가 들어갈 수 있을까
package SWEA_D2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D2_1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N+1][N+1];
//			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					arr[i][j] = 2;
					arr[i][j] = sc.nextInt();
				}
			}

			int cnt = 0;
			int result = 0;
			for(int i = 0; i < N; i++)
			{
				cnt = 0;
				for(int j = 0; j < N; j++)
				{
					if(arr[i][j] == 1)
					{
						cnt++;
					}
										
					if(cnt == K && arr[i][j+1] == 0)
					{
						result++;
						cnt = 0;
//						continue;
					}
					
					if(cnt < K && arr[i][j+1] == 0)
					{
						cnt = 0;
					}
					
					if(cnt > K)
						cnt = 0;
					
				}
//				System.out.println(result);
				
			}
			
			for(int i = 0; i < N; i++)
			{
				cnt = 0;
				for(int j = 0; j < N; j++)
				{
					if(arr[j][i] == 1)
					{
						cnt++;
					}
					
										
					if(cnt == K && arr[j+1][i] == 0)
					{
						result++;
						cnt = 0;
//						System.out.println("   i = " + i + "   j = " + j);
					}
					
					if(cnt < K && arr[j+1][i] == 0)
					{
						cnt = 0;
					}
					
					if(cnt > K)
						cnt = 0;
					
				}
//				System.out.println(result);
			}
			
			

			System.out.println("#" + tc + " " + result);
		}
	}

}
