import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 종구의딸이름짓기 {
	
	static class Node{
		int r, c;
		char ch;
		Node( int r, int c , char ch){
			this.r = r;
			this.c = c;
			this.ch = ch;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());


			char[][] chArr = new char[N][M];

			for(int i = 0; i < N; i++) {
				chArr[i] = br.readLine().toCharArray();
			}

			boolean[][] visited = new boolean[N][M];
			Queue<Node> queue = new LinkedList<>();
			queue.add(new Node(0,0, chArr[0][0]));
			visited[0][0] = true;
			char ch = chArr[0][0];
			StringBuilder sb = new StringBuilder();
			while( !queue.isEmpty() ) {
				sb.append(ch);
				char next = 'z'; 
				int size = queue.size();
				for(int i = 0; i < size; i++) {
					Node current = queue.poll();
					if( ch == current.ch ) {
						for(int d = 0; d < 2; d++) {
							int nr = current.r + dr[d];
							int nc = current.c + dc[d];
							if( nr >= N || nc >= M )
								continue;
							if( visited[nr][nc] )
								continue;
							
							visited[nr][nc] = true;
							queue.add(new Node(nr,nc,chArr[nr][nc]));
							if( next >= chArr[nr][nc] )
								next = chArr[nr][nc];
						}
					}
				}
				ch = next;
			}
			System.out.println("#" + tc + " " + sb.toString());
		}
	}
	static int[] dr = {1,0};
	static int[] dc = {0,1};
}






