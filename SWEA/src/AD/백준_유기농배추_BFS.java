package AD;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_유기농배추_BFS {

	static int T;
	static Scanner sc = new Scanner(System.in);
	static int M;
	static int N;
	static int K;
	static int[][] arr;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static boolean inArr(int x, int y)
	{
		return x>=0&&y>=0&&x<M&&y<N;
	}
	
	static class Point
	{
		int x, y;
		Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			arr = new int[N+2][M+2];
			for(int i = 0; i < K; i++)
			{
				int c = sc.nextInt();
				int r = sc.nextInt();
				arr[r+1][c+1] = 1;
				
			}
			
			int cnt = 0;
			for(int i = 1; i <= N; i++)
			{
				for(int j = 1; j <= M; j++)
				{
					if( arr[i][j] == 1)
					{
						cnt++;
						//BFS 탐색 시작.
						
						//큐를 준비하고
						Queue<Point> queue = new LinkedList<>();
						arr[i][j] = 0;
						//첫번째 상태노드를 큐에 삽입.
						queue.add(new Point(i, j));
						
						//큐가 빌 때까지
						while( !queue.isEmpty() )
						{
							//큐에서 꺼내서 배추 없는걸로 변경하고
							Point p = queue.poll();
							//상하좌우로 인접한 배추를 큐에 삽입
							for(int d = 0; d < 4; d++)
							{
								int nx = p.x + dx[d];
								int ny = p.y + dy[d];
								
								if( arr[nx][ny] == 1 )
								{
									arr[nx][ny] = 0;
									queue.add(new Point(nx, ny));
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




//	static void dfs(int x, int y)
//	{
//		//현재 좌표를 0으로 변경.
//		arr[x][y] = 0;
//		//사방에 대해서 1인경우,, 재귀호출.
//		for(int i = 0; i < 4; i++)
//		{
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			
//			if( arr[nx][ny] == 1 )
//			{
//				arr[nx][ny] = -1;
//				dfs(nx, ny);
//			}
//		}
//	}


