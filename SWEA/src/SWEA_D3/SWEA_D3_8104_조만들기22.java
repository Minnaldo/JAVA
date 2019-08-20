package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_8104_조만들기22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] sum = new int[K];
			for(int k = 0; k < K; k++)
			{
				for(int i = 0; i < N/2; i++)
				{
					sum[k] += ( (2 + (4*i)) * K) + 1;
				}
			}
			if( N % 2 == 1)
			{
				int val = N*K;
				for(int i = K-1; i >= 0; i--)
				{
					sum[i] += val--;
				}
			}
			
			System.out.print("#" + tc + " ");
			for(int i = 0; i < K; i++)
				System.out.print(sum[i] + " ");
			System.out.println();
		}
	}

}
