//SWEA_D3_2817. 부분 수열의 합.

package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_2817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			int result = 0;
					//2^N 만큼 있기 때문에 (1 << N)
			for (int i = 0; i < (1 << N); i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					//0이 아닌게 나오면 누적합
					if (((1 << j) & i) != 0) {
						sum += arr[j];
					}
				}
				
				if (sum == K)
					result++;
			}

			System.out.println("#" + tc + " " + result);

		}
	}

	static int count = 0;
	static int result = 0;
	static void subsum(int[] arr, int idx, int sum)
	{
		
		
		subsum(arr, idx+1, sum);
		subsum(arr, idx+1, sum + arr[idx]);
	}
	
}
