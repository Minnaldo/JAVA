import java.util.Arrays;
import java.util.Scanner;

public class 배낭문제_메모이제이션 {
	static int N;
	static int K;
	static int[] weights;
	static int[] values;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			weights = new int[N];
			values = new int[N];

			for (int i = 0; i < N; i++) {
				weights[i] = sc.nextInt();
				values[i] = sc.nextInt();
			}
			memo = new int[N][K+1];
			for(int i = 0; i < N; i++)
				Arrays.fill(memo[i], -1);
			dfs(0, 0);
			dfs(0, 0, 0);
			System.out.println(memoCnt);
			System.out.println(nonMemoCnt);
		}
	}
	static int memoCnt = 0;
	static int nonMemoCnt = 0;
	static int[][] memo;
	static int dfs(int idx, int weight) {
		if(memo[idx][weight] != -1 )
			return memo[idx][weight];
		memoCnt++;
		if (idx == N) {
			return 0;
		}
		// 못담음
		if (weight + weights[idx] > K) {
			memo[idx][weight] = dfs(idx + 1, weight);
			return memo[idx][weight];
		} else
			memo[idx][weight] = Math.max(dfs(idx + 1, weight), values[idx] + dfs(idx + 1, weight + weights[idx]));
			return memo[idx][weight];
	}

	
	
	
	
	// 상태는 검사중인 아이템의 번호, 지금까지 무게, 지금까지 가치
	static void dfs(int idx, int weight, int value) {
		nonMemoCnt++;
		if (idx == N) {
			return;
		}
		dfs(idx + 1, weight, value);
		dfs(idx + 1, weight + weights[idx], value + values[idx]);
	}
}
