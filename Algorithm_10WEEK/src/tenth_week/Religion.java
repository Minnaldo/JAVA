package tenth_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Religion {
	static int[] parents;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // (0 < n <= 50,000)
		int m = sc.nextInt(); // (0 <= m <= 100,000)
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nm = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nm.nextToken());
		int M = Integer.parseInt(nm.nextToken());
		//만약 한 줄에 1개의 정수값이라면 
		int l = Integer.parseInt(br.readLine());
		*/
		parents = new int[n+1];
		for (int i = 1; i < n+1; i++) {
			parents[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			union(x, y);
		}
		int count = 0;
		for (int i = 1; i < n+1; i++) {
			if(i == parents[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
	static int findSet(int x) {
		if(parents[x] == x) {
			return x;
		}
		parents[x] = findSet(parents[x]);
		return parents[x];
	}
	static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		parents[py] = px;
	}
}