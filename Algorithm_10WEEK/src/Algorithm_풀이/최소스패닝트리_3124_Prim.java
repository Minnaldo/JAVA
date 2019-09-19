package Algorithm_풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 최소스패닝트리_3124_Prim {

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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer nm = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++)
		{
			StringTokenizer nm = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(nm.nextToken());
			int E = Integer.parseInt(nm.nextToken());

			ArrayList<Edge>[] adj = new ArrayList[V+1];
			for(int i = 1; i < V+1; i++)
			{
				adj[i] = new ArrayList<>();
			}

			for(int i = 1; i < E+1; i++) {
				StringTokenizer nm2 = new StringTokenizer(br.readLine());
				int v1 = Integer.parseInt(nm2.nextToken());
				int v2 = Integer.parseInt(nm2.nextToken());
				int cost = Integer.parseInt(nm2.nextToken());
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

			System.out.println("#" + tc + " " + result);
		}
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