package 연습해보기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 최소스패닝트리_Kruskal {

	static int[] parents;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			parents = new int[V+1];
			for(int i = 1; i < V; i++) {
				parents[i] = i;
			}
			
			int[][] edges = new int[E][3];
			for(int i = 0; i < E; i++) {
				edges[i][0] = sc.nextInt();
				edges[i][1] = sc.nextInt();
				edges[i][2] = sc.nextInt();
			}
			
			Arrays.sort(edges, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1[2], o2[2]);
				}
			});
			
			int cnt = 0;
			long result = 0;
			for(int i = 0; i < edges.length; i++) {
				if(cnt == V-1)
					break;
				if(findSet(edges[i][0]) != findSet(edges[i][1])) {
					cnt++;
					result += edges[i][2];
					unionSet(edges[i][0], edges[i][1]);
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
	
	static int findSet(int x) {
		if( parents[x] == x )
			return x;
		parents[x] = findSet(parents[x]);
		return parents[x];
	}
	
	static void unionSet(int x, int y) {
		int nx = findSet(x);
		int ny = findSet(y);
		parents[nx] = ny;
	}
}
