import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class 게리맨더링_HYO {

	static int N;			//선거구의 갯수
	static int[] voters;	//각 선거구별 유권자 수
	static int[][] adj;		//선거구 간의 인접 정보
	static boolean[] sel;	//선거구를 true/ false 두 집단으로 나눔.
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		voters = new int[N+1];
		adj = new int[N+1][N+1];
		sel = new boolean[N+1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			voters[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			for(int j = 1; j <= cnt; j++) {
				int other = Integer.parseInt(st.nextToken());
				adj[i][other] = 1;
				adj[other][i] = 1;
			}
		}
		powerSet(1);
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	static public void powerSet(int idx) {
		if(idx == N+1) {
			if(check()) {
				int sumA = 0;
				int sumB = 0;
				
				for(int i = 1; i <= N; i++) {
					if(sel[i])
						sumA += voters[i];
					else
						sumB += voters[i];
				}
				ans = Math.min(ans, Math.abs(sumA - sumB));
			}
			return;
		}
		
		sel[idx] = true;
		powerSet(idx+1);
		sel[idx] = false;
		powerSet(idx+1);
	}

	static boolean check() {
		List<Integer> areaA = new ArrayList<>();
		List<Integer> areaB = new ArrayList<>();

		for(int i = 1; i <= N; i++) {
			if( sel[i] )
				areaA.add(i);
			else
				areaB.add(i);
		}

		if( areaA.size() == 0 || areaB.size() == 0 )
			return false;

		boolean[] visited = new boolean[N+1];

		// A마을 아무 지점이나 출발로, B마을 아무 지점이나 출발로,
		// 각각 BFS, DFS를 통해 탐색해보고 방문할 떈 true로 변경.
		// 양쪽 다 탐색 후 visited에 1번부터 N번까지 모두 true가 되어있다면, 모두 연결된 것.
		if(areaA.size() > 0) {
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(areaA.get(0));
			visited[areaA.get(0)] = true;
			while(!queue.isEmpty()) {
				int node = queue.poll();

				for(int i = 1; i <= N; i++) {
					if(sel[i] && adj[node][i] != 0 && !visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
		}

		if(areaB.size() > 0) {
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(areaB.get(0));
			visited[areaB.get(0)] = true;
			while(!queue.isEmpty()) {
				int node = queue.poll();

				for(int i = 1; i <= N; i++) {
					if(!sel[i] && adj[node][i] != 0 && !visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
		}

		
		for(int i = 1; i <= N; i++) {
			if(!visited[i])
				return false;
		}
		return true;
	}

}


//System.out.print("A마을 : ");
//for(int i=1; i<=N; i++) {
//	if(sel[i]) {
//		System.out.print(i + " ");
//	}
//}
//System.out.println();
//System.out.print("B마을 : ");
//for(int i=1; i<=N; i++) {
//	if(!sel[i])
//		System.out.print(i+" ");
//}
//System.out.println();