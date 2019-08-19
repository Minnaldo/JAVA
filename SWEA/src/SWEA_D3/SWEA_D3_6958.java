//SWEA_D3_6958. 동철이의 프로그래밍
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_6958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][M];
			
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < M; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[] cnt = new int[N];
			int result = 0;
			int max = 0;
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < M; j++)
				{
					if(arr[i][j] == 1)
						cnt[i]++;
				}
				
				if(max < cnt[i])
					max = cnt[i];
			}
			
			for(int i = 0; i < N; i++)
			{
				if(max == cnt[i])
					result++;
			}
			
//			if(result == N && max == N)
//				System.out.println("#" + tc + " " + result);
//			else
			System.out.println("#" + tc + " " + result + " " + max);
		}
	}

}
