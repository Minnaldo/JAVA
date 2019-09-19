package tenth_week;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
//Prim_PriorityQueue
public class Prim_PriorityQueue {

	static class Edge implements Comparable<Edge>{
		int dest;
		int cost;
		Edge(int d, int c) {
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("7 11\n" +
				"0 1 31\r\n" + 
				"0 2 31\r\n" + 
				"0 6 31\r\n" + 
				"0 5 60\r\n" +
				"1 2 21\r\n" + 
				"2 4 46\r\n" + 
				"2 6 25\r\n" + 
				"3 4 34\r\n" + 
				"4 6 51\r\n" + 
				"5 3 18\r\n" + 
				"5 4 40\r\n" ); 

		int V = sc.nextInt();
		int E = sc.nextInt();
		
		ArrayList<Edge>[] adj = new ArrayList[V];
		for(int i = 0; i < V; i++)
		{
			adj[i] = new ArrayList<>();
		}

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
		visited[0] = true;
		pq.addAll(adj[0]);
		int result = 0;
		
		while( cnt < V ) {
			//가장 작은 비용의 간선이 나옴.
			Edge e = pq.poll();
			
			//이미 확보된 정점이 도착지면 패스
			if( visited[e.dest] )
				continue;
			
			//e.dest목적지 간선을 선택
			pq.addAll( adj[e.dest] );
			visited[e.dest]= true;
			cnt++;
			result += e.cost;
		}
		
		System.out.println(result);
		
	}
}

/*
 * Prim Algorithm
아무 정점이나 선택
선택된 정점으로부터 뻗어나가는 모든 간선 중에서
아직 선택되지 않은 정점으로 연결되면서
가장 저렴한 간선을 골라서
그 간선으로 연결된 정점을 선택해 나간다.
선택한 정점이 V개가 될 때, 최소신장트리는 완성.
*/

//오른쪽 수도코드와 왼쪽 실제코드를  번갈아가면서 보며 충분히 되새김.
//위처럼 하여, 되새김이 완료되면 저 부분을 PriorityQueue를 활용하는 방법을 고찰.