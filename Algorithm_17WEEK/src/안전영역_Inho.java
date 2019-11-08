import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 안전영역_Inho {
	static int N;
	static int[][] map;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		int highst = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				highst = Math.max(highst, map[i][j]);
			}
		}
		int n = 1;
		int max = 1;
		while(n <= highst) {
			int temp = 0;
			boolean[][] visited = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if(map[i][j] > n && !visited[i][j]) {
						visited[i][j] = true;
						bfs(n, i, j, visited);
						temp++;
					}
				}
			}
			max = Math.max(max, temp);
			n++;
		}
		System.out.println(max);
	}
	static void bfs(int n, int x, int y, boolean[][] visited) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		while(!q.isEmpty()) {
			Point temp = q.poll();
			for (int i = 0; i < 4; i++) {
				int ni = temp.x + dr[i];
				int nj = temp.y + dc[i];
				if(in_map(ni, nj) && !visited[ni][nj] && map[ni][nj] > n) {
					visited[ni][nj] = true;
					bfs(n, ni, nj, visited);
				}
			}
		}
	}
	static boolean in_map(int x, int y) {
		return x>=0 && x<N && y>=0 && y<N;
	}
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}