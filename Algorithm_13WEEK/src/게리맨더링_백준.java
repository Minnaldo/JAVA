import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 게리맨더링_백준 {
	static int N; //선거구의 갯수
	static int[] voters; //각 선거구별 유권자의 수
	static int[][] adj; //선거구 간의 인접 정보
	static boolean[] sel; //선거구를 true / false 두집단으로 나눔
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		voters = new int[N+1];
		
		for(int i = 1; i <= N; i++)
			voters[i] = sc.nextInt();
		adj = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			int cnt = sc.nextInt();// i번째 선거구와 연결된 선거구의 갯수
			for(int j = 0; j < cnt; j++) {
				int other = sc.nextInt();
				adj[i][other] = 1;
				adj[other][i] = 1;
			}
		}
		sel = new boolean[N+1];
		powerSet(1);
		System.out.println(ans == 987654321 ? -1 : ans);
	}
	static int ans = 987654321;
	static void powerSet(int idx) {
		if(idx == N + 1) {
			// 각 마을 집단이 서로서로 모두 연결인지 검사해서 true/false 리턴
			if( check() ) {
				int sumA = 0;
				int sumB = 0;
				for(int i = 1; i <= N; i++) {
					if(sel[i])
						sumA += voters[i];
					else
						sumB += voters[i];
				}
				ans = Math.min(ans, Math.abs(sumA-sumB));
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
		for(int i = 1; i<= N; i++) {
			if(sel[i])
				areaA.add(i);
			else
				areaB.add(i);
		}
		if( areaA.size() == 0 || areaB.size() == 0 )
			return false;
		
		boolean[] visited = new boolean[N+1];
		//A마을 아무 지점이나 출발로, B마을 아무 지점이나 출발로, 각각 BFS 혹은 DFS를 통해 탐색하며 방문할땐 true변경
		//양쪽 다 탐색 후 visited 의 1번부터 N번까지 모두 true가 되있다면, 모두 연결된것
		if( areaA.size() > 0 ) {
			Queue<Integer> queue = new LinkedList<>();
			queue.add(areaA.get(0));
			visited[areaA.get(0)] = true;
			while( !queue.isEmpty() ) {
				int node = queue.poll();
				for(int i = 1; i <= N; i++) {
					//sel[i]가 true이면 A마을.
					//A마을이면서, 인접경로가 존재하고, 아직 방문하지 않았다면 큐에 추가
					if( sel[i] && adj[node][i] != 0 && !visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
		}
		if( areaB.size() > 0 ) {
			Queue<Integer> queue = new LinkedList<>();
			queue.add(areaB.get(0));
			visited[areaB.get(0)] = true;
			while( !queue.isEmpty() ) {
				int node = queue.poll();
				for(int i = 1; i <= N; i++) {
					if( !sel[i] && adj[node][i] != 0 && !visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			if( !visited[i] )
				return false;
		}
		return true;
	}
}















/*static void powerSet(int idx) {
	if(idx == N+1) {
		//sel 이 true인 idx는 A마을
		System.out.print("A마을 : ");
		for(int i = 1; i <= N; i++) {
			if(sel[i])
				System.out.print(i + " ");
		}
		System.out.println();

		//sel 이 false인 idx는 B마을
		System.out.print("B마을 : ");
		for(int i = 1; i <= N; i++) {
			if(!sel[i])
				System.out.print(i + " ");
		}
		System.out.println();
		return;
	}
	sel[idx] = true;
	powerSet(idx+1);
	sel[idx] = false;
	powerSet(idx+1);
}*/