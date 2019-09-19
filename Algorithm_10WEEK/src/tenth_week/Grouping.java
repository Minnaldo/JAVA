package tenth_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grouping {
	static int[] parents;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			parents = new int[N+1];
			for (int i = 1; i < N+1; i++) {
				parents[i] = i;
			}
			for (int i = 0; i < M; i++) {
				StringTokenizer temp = new StringTokenizer(br.readLine());
				union(Integer.parseInt(temp.nextToken()), Integer.parseInt(temp.nextToken()));
			}
			int count = 0;
			for (int i = 1; i < parents.length; i++) {
				if(i == parents[i]) {
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
	static int findSet(int x) {
		if(parents[x] == x) {
			return x;
		}
		parents[x] = findSet(parents[x]);
		return parents[x];
	}
	static void union(int x, int y) {
		int nx = findSet(x);
		int ny = findSet(y);
		parents[nx] = ny;
	}
}