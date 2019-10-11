import java.util.Arrays;
import java.util.Scanner;

public class 키순서_플로이드워샬 {

	static int N;
	static int[][] adj;
	static int[] cntArr;
	static final int INF = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 사람의 수
			adj = new int[N + 1][N + 1];
			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				adj[a][b] = 1;
			}

			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					if (adj[i][j] != 1)
						adj[i][j] = INF;
				}
			}

			// 탐색을 하며, 새로운 노드를 만날때마다, 최초 출발지의 카운트값을 1씩 늘리자.
			// 플로이드 워셜, 체크
			cntArr = new int[N + 1];
			for (int k = 1; k < N + 1; k++) {
				for (int i = 1; i < N + 1; i++) {
					for (int j = 1; j < N + 1; j++) {
						if (adj[i][k] != INF && adj[k][j] != INF)
							adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			int[] sum = new int[N + 1];
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					if (adj[i][j] != INF) {
						sum[i] += 1;
						sum[j] +=1;
					}
				}
			}

			
			int cnt = 0;
			for (int i = 1; i <= N; i++) {
				if (sum[i]==N-1)
					cnt++;
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}
}
