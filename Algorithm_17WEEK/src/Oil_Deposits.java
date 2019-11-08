import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Oil_Deposits {
	static int[] dr = {-1, -1, -1, 0, 1, 1, 1, 0};//좌상, 상, 우상, 우, 우하, 하, 좌하, 좌
	static int[] dc = {-1, 0, 1, 1, 1, 0, -1, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) {
				break;
			}
			char[][] grid = new char[n][m];
			for (int i = 0; i < n; i++) {
				String input = sc.next();
				grid[i] = input.toCharArray();
			}
			
			Queue<Node> q = new LinkedList<>();
			boolean[][] visited = new boolean[n][m];
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(grid[i][j] == '@' && !visited[i][j]) {
						visited[i][j] = true;
						q.add(new Node(i, j));
						
						while(!q.isEmpty()) {
							Node node = q.poll();
							for (int k = 0; k < 8; k++) {
								int ni = node.x + dr[k];
								int nj = node.y + dc[k];
								if( ni >= 0 && ni < n && nj >= 0 && nj < m && !visited[ni][nj] && grid[ni][nj] == '@') {
									visited[ni][nj] = true;
									q.add(new Node(ni, nj));
								}
							}
							if(q.isEmpty()) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}