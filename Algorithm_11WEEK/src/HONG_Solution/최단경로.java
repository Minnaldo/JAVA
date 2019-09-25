import java.util.ArrayList;
import java.util.Scanner;

public class 최단경로 {
	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		int sel = sc.nextInt();
		// 인접리스트
		ArrayList<pair>[] list = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; i++) {
			list[sc.nextInt()].add(new pair(sc.nextInt(), sc.nextInt()));
		}
		// 최단거리를 기록할 배열
		int[] dist = new int[V + 1];
		boolean[] visited = new boolean[V + 1];

		for (int i = 1; i <= V; i++) {
			dist[i] = INF;

		}
		for (int i = 0; i < list[sel].size(); i++) {
//			if( dist[list[sel].get(i).v1] > list[sel].get(i).cost)
				dist[list[sel].get(i).v1] = list[sel].get(i).cost;
		}
		// 0번 정점에서 각 정점으로 최단거리가 얼만지 구해봅시다.
		visited[sel] = true;
		dist[sel] = 0;
		// V-1개의 정점을 선택해가며 최단거리를 갱신할거임
		for (int i = 0; i < V - 1; i++) {

			// dist배열 중에서 가장 값이 작은 정점을 찾으시오.
			int min = INF, midx = -1;
			for (int j = 1; j <= V; j++) {
				if (!visited[j] && min > dist[j]) {
					min = dist[j];
					midx = j;

				}
			}
			// 모든 정점에 대해서 시작점에서 min위치를 들러서 다른 정점으로 가는 거리와 기존에 알고있던 dist보다 작으면 갱신
			if (min == INF && midx == -1)
				continue;
			for (int j = 0; j < list[midx].size(); j++) {
				// min에서 검사하는 정점으로 갈 수 있는지 여부 adj[min][j] != 0
				// 검사하는 정점까지 알고 있던 거리 dist[j]
				// min을 거쳐서 검사하는 정점까지 가는 거리 dist[min] + adj[min][j]
				if (!visited[list[midx].get(j).v1] && list[midx].get(j).cost!=INF && dist[midx] + list[midx].get(j).cost < dist[list[midx].get(j).v1])
					dist[list[midx].get(j).v1] = dist[midx] + list[midx].get(j).cost;

			}
			visited[midx] = true;
		}
		for (int i = 1; i <= V; i++) {
			if (dist[i] != INF)
				System.out.println(dist[i]);
			else
				System.out.println("INF");
		}
	}

	static class pair {
		int v1, cost;

		public pair(int v1, int cost) {
			super();
			this.v1 = v1;
			this.cost = cost;
		}
	}

}
