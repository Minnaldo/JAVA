package tenth_week;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner("6 11\r\n" + "0 1 3\r\n" + "0 2 5\r\n" + "1 2 2\r\n" + "1 3 6\r\n" + "2 1 1\r\n"
				+ "2 4 6\r\n" + "2 3 4\r\n" + "3 4 2\r\n" + "3 5 3\r\n" + "4 0 3\r\n" + "4 5 6");

		int V = sc.nextInt();
		int E = sc.nextInt();

		//인접행렬
		int[][] adj = new int[V][V];
		for(int i = 0; i < E; i++)
			adj[sc.nextInt()][sc.nextInt()] = sc.nextInt();

		//최단거리를 기록할 배열..
		int[] dist = new int[V];
		boolean[] visited = new boolean[V];
		//0번 정점에서 각 정점으로 최단거리가 얼만지... 구해봅시다.
		visited[0] = true;
		for(int i = 0; i < V; i++) {
			dist[i] = adj[0][i];
			if( adj[0][i] == 0 )
				dist[i] = 999;
		}

		System.out.println(Arrays.toString(dist));
		//V-1개의 정점을 선택해가며 최단거리를 갱신할거임.
		for(int i = 0; i < V-1; i++) {
			//dist배열 중에서 가장 값이 작은 정점을 찾으시오.
			int minIdx = 0;
			int min = 999;
			for(int j = 0; j < V; j++) {
				minIdx = j;
				min = dist[j];
			}
		}
		
		//*여기가 중요*
		//모든 정점에 대해서 시작점에서 min위치를 들러서 
		//다른 정점으로 가는 거리가 기존에 알던 dist보다 작으면 갱신
		for(int j = 0; j < V; j++) {
			//minㅇ에서 검사하는 정점으로 갈 수 있는ㄴ지 여붑 adj[min][j] != 0
			//검사하는 정점까지 알고 있던 걱리 dist[j]
			//min을 거쳐서 검사하는 정점까지 가는 거리 dist[min] + adj[min][j]
			if( adj[minIdx][j] != 0 && dist[minIdx] + adj[minIdx][j] < dist[j] )
				dist[j] = dist[minIdx] + adj[min][j];
		}
		
		visited[minIdx] = true;
		System.out.println(Arrays.toString(dist));
	}
}
