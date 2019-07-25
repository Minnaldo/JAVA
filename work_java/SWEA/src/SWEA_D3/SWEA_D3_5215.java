//SWEA_D3_5215. 햄버거 다이어트
//비트연산 이용해서 풀기.
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int tc = 1; tc <= test_case; tc++)
		{
			int N = sc.nextInt();
			int L = sc.nextInt();
			
			int[] taste = new int[N];
			int[] kcal = new int[N];
			for(int i = 0; i < N; i++)
			{
				taste[i] = sc.nextInt();
				kcal[i] = sc.nextInt();
			}
			
			int max = 0;
			//2^n 번 검사,, 난 전부 다 검사를 할거야.
			for(int i = 0; i < (1 << N); i++)
			{
				int ksum = 0, tsum = 0;
				//N번 입력한 값들을 검사하겠다.
				for(int j = 0; j < N; j++)
				{	
					if(((1 << j) & i) != 0)
					{
						ksum += kcal[j];
						tsum += taste[j];
					}
					
					if (ksum > L)
						break;
					if(tsum > max)
						max = tsum;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
