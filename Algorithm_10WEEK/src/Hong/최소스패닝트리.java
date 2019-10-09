import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;




public class 최소스패닝트리 {
	static class Edge implements Comparable<Edge>{
		int dest;
		int cost;
		Edge(int d, int c){
			dest = d;
			cost = c;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cost, o.cost);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner("1\n 7 11\n" + "0 1 31\r\n" + "0 2 31\r\n" + "0 6 31\r\n" + "0 5 60\r\n" + "1 2 21\r\n"
				+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n");
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			ArrayList<Edge>[] adj = new ArrayList[V+1];
			for(int i = 0; i <= V; i++)
				adj[i] = new ArrayList<>();
			for(int i = 0; i < E; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				int cost = sc.nextInt();
				adj[v1].add(new Edge(v2, cost));
				adj[v2].add(new Edge(v1, cost));
			}
			PriorityQueue<Edge> pq = new PriorityQueue<>();
			boolean[] visited = new boolean[V+1];
			int cnt = 1;
			visited[1] = true;
			pq.addAll(adj[1]);
			long result = 0;
			while( cnt < V ) {
				Edge e = pq.poll();
				
				//e.dest목적지 간선을 선택
				if( visited[e.dest])
					continue;
				
				pq.addAll( adj[e.dest] );
				visited[e.dest] = true;
				cnt++;
				result += e.cost;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
