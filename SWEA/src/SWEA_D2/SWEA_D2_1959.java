//SWEA_D2_1959. 두 개의 숫자열
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N];
			int[] brr = new int[M];
			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			for(int i = 0; i < M; i++)
				brr[i] = sc.nextInt();
			
			int sum = 0;
			int max = 0;
			if(N > M)
			{
				for(int i = 0; i < (N-M); i++)
				{
					sum = 0;
					for(int j = i; j < M + i; j++)
					{
						sum += (arr[j] * brr[j]);
					}
					if(max < sum)
					{
						max = sum;
					}
				}
			}
			else
			{
				for(int i = 0; i < (N-M); i++)
				{
					sum = 0;
					for(int j = i; j < N; j++)
					{
						sum += (brr[j] * arr[j]);
					}
					if(max < sum)
					{
						max = sum;
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
			
		}
		
	}

}
