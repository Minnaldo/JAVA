package tenth_week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kruskal_Practice {

	static int[] parents;
	
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
		
		int V = sc.nextInt();	//정점의 개수
		int E = sc.nextInt();	//간선의 개수
		
		//0열은 출발정점, 1열은 도착정점, 2열은 간선비용
		int[][] edges = new int[E][3];	//각 행은 간선의 정보.
		for(int i = 0; i < E; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}
		
		//edges배열을 2번열 기준으로 정렬하자.
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1[2], o2[2]);
			}
		});
		
		parents = new int[V];
		for(int i = 0; i < V; i++)
			parents[i] = i;
		
		int cnt = 0;	//간선을 몇 개 선택 했는지 저장할 변수
		int result = 0; //선택된 간선 비용의 총합을 저장할 변수
		
		//모든 간선을 돌면서
		for(int i = 0; i < E; i++) {
			//만약 edges[i] 간선 정보의 출발정점과 도착정점이 둘이 같은 집합이 아니라면
			if(findSet(edges[i][0]) != findSet(edges[i][1])) {
				//간선을 선택하고 유니온!
				cnt++;
				result += edges[i][2];
				union(edges[i][0], edges[i][1]);
				//간선이 V-1개 선택되면 종료.
				if( cnt == V-1 )
					break;
			}
		}
		System.out.println(result);
	}

	static int findSet(int x) {
		if(parents[x] == x) {
			return x;
		}
		parents[x] = findSet(parents[x]);
		return parents[x];
		
		/*int tmp = x;
		while( tmp != parents[tmp]) 
			tmp = parents[tmp];
		parents[x] = tmp;
		return parents[x];*/
	}
	
	static void union(int x, int y) {
		int nx = findSet(x);
		int ny = findSet(y);
		parents[nx] = ny;
	}
}
