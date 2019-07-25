package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_2817_subsum {

	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			count = 0;
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			subsum(arr, K, 0, 0);

			System.out.println("#" + tc + " " + count);

		}
	}

	
	static void subsum(int[] arr, int K, int idx, int sum) {
		if (idx == arr.length)
		{
			if(sum == K)
				count++;
			return;
		}
		
		subsum(arr, K, idx + 1, sum);
		subsum(arr, K, idx + 1, sum + arr[idx]);
	}
}
