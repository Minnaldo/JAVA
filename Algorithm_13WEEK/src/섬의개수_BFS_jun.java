import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬의개수_BFS_jun {

	static class Node {
		int W, H;
		
		Node(int W, int H) {
			this.W = W;
			this.H = H;
		}
	}
	
	static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			
			if(W == 0 & H == 0)
				break;
			
			int[][] arr = new int[H][W];
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			int cnt = 0;
			
			Queue<Node> queue = new LinkedList<>();
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(arr[i][j] == 1) {
						boolean[][] check = new boolean[H][W];
						cnt++;
						queue.add(new Node(i, j));
						arr[i][j] = 0;
						check[i][j] = true;
						
						while(!queue.isEmpty()) {
							Node node = queue.poll();
							for(int k = 0; k < 8; k++) {
								int nx = node.H + dx[k];
								int ny = node.W + dy[k];
								
								if(nx >= 0 && ny >= 0 && nx < H && ny < W && check[nx][ny] == false && arr[nx][ny] == 1)  {
									queue.add(new Node(nx, ny));
									arr[nx][ny] = 0;
									check[nx][ny] = true;
								}
							}
						}
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

}
