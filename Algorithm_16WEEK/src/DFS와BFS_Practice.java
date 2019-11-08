import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS_Practice {
	
	static int N;
	static int M;
	static int start_V;
	
	static int[][] map;
	static boolean[] visited;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start_V = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		int temp1 = 0, temp2 = 0;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			temp1 = Integer.parseInt(st.nextToken());
			temp2 = Integer.parseInt(st.nextToken());
			
			map[temp1][temp2] = 1;
			map[temp2][temp1] = 1;
		}
		
		//DFS
		visited[start_V] = true;
		DFS(start_V);
		bw.write("\n");
		
		//BFS
		Arrays.fill(visited, false);
		visited[start_V] = true;
		BFS(start_V);
		
		bw.flush();
	}

	private static void BFS(int x) throws IOException {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		bw.write(x + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 1; i <= N; i++) {
				if(visited[i] == false && map[temp][i] == 1) {
					visited[i] = true;
					queue.add(i);
					bw.write(i + " ");
				}
			}
		}
		
		bw.flush();
		
	}

	private static void DFS(int x) throws IOException {
		
		bw.write(x + " ");
		bw.flush();
		
		for(int i = 1; i <= N; i++) {
			if(visited[i] == false && map[x][i] == 1) {
				visited[i] = true;
				DFS(i);
			}
		}
		
		
	}

}
