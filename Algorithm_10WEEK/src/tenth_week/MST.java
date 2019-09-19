package tenth_week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MST {
	static int[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			v = new int[V+1];
			for (int i = 1; i < v.length; i++) {
				v[i] = i;
			}
			int[][] edges = new int[E][3];
			for (int i = 0; i < E; i++) {
				edges[i][0] = sc.nextInt();
				edges[i][1] = sc.nextInt();
				edges[i][2] = sc.nextInt();
			}
			Arrays.sort(edges, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o1[2]-o2[2];
				}
			});
			
			int cnt = 0;
			long min = 0;
			for (int i = 0; i < edges.length; i++) {
				if(cnt == V-1) {
					break;
				}
				if(findSet(edges[i][0]) != findSet(edges[i][1]))
				{
					cnt++;
					min += edges[i][2];
					unionSet(edges[i][0], edges[i][1]);
				}else {
					continue;
				}
			}
			System.out.println("#"+tc+" "+min);
		}
	}
	
	static int findSet(int x) {
		if(v[x] == x) {
			return x;
		}
		v[x] = findSet(v[x]);
		return v[x];
	}
	
	static void unionSet(int x, int y) {
		int nx = findSet(x);
		int ny = findSet(y);
		
		v[nx] = ny;
	}
}