//SWEA_D3_8104_조만들기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_8104_조만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][K];
			int val = 1;
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < K; j++)
				{
//					arr[i][j + ( K-1 - (2*j))*(i%2) ] = val++;
					if(i % 2 == 0)
						arr[i][j] = val++;
					else
						arr[i][K-1-j] = val++;
				}
			}
			int[] sum = new int[K];
			for(int i = 0; i < K; i++)
			{
				for(int j = 0; j < N; j++)
				{
					sum[i] += arr[j][i];
				}
			}
			System.out.print("#" + tc + " ");
			for(int i = 0; i < K; i++)
			{
				System.out.print(sum[i] + " ");
			}
			System.out.println();
			
				
		}

	}

}


//int N = sc.nextInt();
//int K = sc.nextInt();
//
//int[] arr = new int[N*K+1];
//int[] sum = new int[K+2];
//int cnt = 1;
//
//for(int i = 1; i <= N*K; i++)
//{
//	arr[i] = cnt++;
//}
//
//System.out.print("#" + tc);
//for(int i = 1; i <= K; i++)
//{
//	for(int j = 2; j <= N; j+=2)
//	{
//		if(j*(K-i) > N*K)
//			break;
//				
//		
//		sum[i] += arr[K*j];
//		
//		if(j*(K-i) < N*K)
//			sum[i] += arr[K*j+1];
//	}
//	
//	System.out.print(" " + (sum[i] + 1));
//}
//System.out.println();
