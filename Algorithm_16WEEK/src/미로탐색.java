import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;

/*
	- (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램
	- 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
	- 서로 인접한 칸으로만 이동할 수 있다.
 */



public class 미로탐색 {

	static int N;
	static int M;

	static int[][] map;
	static int[][] check;

	static int start_x, start_y;
	static int end_x = 0, end_y = 0;
	static int result = 0;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static boolean inMap(int x, int y) {
		return x >= 1 && x <= N && y >= 1 && y <= M;
	}

	static class Pair {
		int x = 0, y = 0;
		int count = 0;

		Pair(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}	
	
	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Pair> queue = new LinkedList<>();


		//input
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		end_x = N; end_y = M;

		map = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			for(int j = 1; j <= M; j++) {
				map[i][j] = str.charAt(j-1) - '0';
			}
		}

		start_x = 1; start_y = 1;

		check = new int[N+1][M+1];
		queue.add(new Pair(start_x, start_y, 1));
		check[start_x][start_y] = 1;

		//BFS
		while(!queue.isEmpty()) {
			int k1 = queue.peek().x;
			int k2 = queue.peek().y;
			int ct = queue.peek().count;

			queue.poll();

			if(k1 == end_x && k2 == end_y) {
				result = ct;
				break;
			}

			for(int i = 0; i < dx.length; i++) {
				int nx = k1 + dx[i];
				int ny = k2 + dy[i];

				if(inMap(nx, ny) && map[nx][ny] == 1 && check[nx][ny] == 0) {
					check[nx][ny] = 1;
					queue.add(new Pair(nx, ny, ct+1));
				}
			}

		}

		System.out.println(result);

	}



}
