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
			for (int i = 0; i < (1 << N); i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
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

}
