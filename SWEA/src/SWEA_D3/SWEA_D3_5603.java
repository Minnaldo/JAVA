//SWEA_D3_5603. 건초더미
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int[] arr = new int[N];

			int sum = 0, avg = 0;
			int result = 0;
			for(int i = 0; i < N; i++)
			{
				arr[i] = sc.nextInt();
				sum += arr[i];
			}

			avg = sum / N;

			int cnt = 0;
			for(int i = 0; i < N; i++)
			{
				if(arr[i] < avg)
				{
					cnt = avg-arr[i];
					arr[i] += cnt;
					result += cnt;
				}
				
				else
				{
					cnt = avg-arr[i];
					arr[i] -= cnt;
				}
				
			}

			System.out.println("#" + tc + " " + result);
		}
	}

}
