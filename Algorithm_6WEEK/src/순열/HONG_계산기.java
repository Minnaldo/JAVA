package 순열;

import java.util.Scanner;

public class HONG_계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // N( 1 ≤N ≤ 9 )
			int[] arr = new int[N];
			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			max = 0;
			solve(arr, 0, 0);
			System.out.println(max);
		}
	}
	static int max = 0;
	//만약 더하거나 곱하는 경우를 모두 둘다 해봐야된다면, 상태공간트리를 모두 탐색
	static void solve(int[] arr, int idx, int val) {
		if( idx == arr.length ) {
			max = Math.max(max, val);
			return;
		}
		
		solve(arr, idx+1, val + arr[idx]);
		solve(arr, idx+1, val * arr[idx]);
	}
	
}