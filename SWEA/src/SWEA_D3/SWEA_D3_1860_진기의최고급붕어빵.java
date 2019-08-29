//SWEA_D3_1860_진기의최고급붕어빵
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_1860_진기의최고급붕어빵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			//			int time = 0, count = 0;

			int[] people_sec = new int[N];
			for(int i = 0; i < N; i++)
			{
				people_sec[i] = sc.nextInt();
			}

			int cnt = 0;
			boolean flag = false;
			for(int i = 0; i < M; i++)
			{
				for(int k = 0; k < M; k++)
				{
					if(people_sec[i] < M)
					{
						flag = false;
						break;
					}
					else
					{
						
					}
					
					cnt++;
				}
//				for(int j = 0; j < N; j++)
//				{
//					if(people_sec[i] < M)
//					{
//						break;
//					}
//					else
//					{
//						M--;
//					}
//				}
			}
		}
	}

}
