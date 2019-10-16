import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 집합의표현_백준 {

	static int[] parents;
	static int[] rank;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		parents = new int[N+1];
		rank = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			parents[i] = i;
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(num == 0) {
				union(a, b);
			}
			
			else {
				if(findSet(a) == findSet(b)) {
					bw.write("YES\n");
				}
				else
					bw.write("NO\n");
				
				bw.flush();
			}
		}
		
		int cnt = 0;
		for(int i = 1; i < N; i++) {
			if (parents[i] == i)
				cnt++;
		}
		
//		System.out.println(cnt);
		
	}
	
	static int findSet(int x) {
		if(parents[x] == x) {
			return x;
		}
		
		return parents[x] = findSet(parents[x]);
	}
	
	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		
		if( rank[x] > rank[y] ) {
			parents[y] = x;
		}
		else {
			parents[x] = y;
			if( rank[x] == rank[y] ) {
				rank[y]++;
			}
		}
	}

}
