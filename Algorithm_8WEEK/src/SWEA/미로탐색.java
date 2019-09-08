package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {

	static int N;
	static int M;
	static Scanner sc = new Scanner(System.in);
	static int[][] arr;

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};

	static boolean inArr(int x, int y)
	{
		return x>=0&&y>=0&&x<N&&y<M;
	}
	
	static class Node{
		int x, y, cnt;
		Node(int x, int y, int cnt)
		{
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N+2][M+2];
		visited = new boolean[N+2][M+2];
		for(int i = 1; i < N+1; i++)
		{
			String str = sc.next();
			for(int j = 1; j < M+1; j++)
			{
				arr[i][j] = str.charAt(j-1) - '0';
			}

		}
//		dfs(1,1,1);
		
		
		Queue<Node> queue = new LinkedList<>();
		//시작점 상태노드를 큐에 담고 방문체크를 한다.
		queue.add(new Node(1, 1, 1));
		visited[1][1] = true;
		//큐가 다 빌 때까지...
		while( !queue.isEmpty() )
		{
			//하나 꺼내서 검사 (도착지인지 검사)
			Node node = queue.poll();
			if( node.x == N && node.y == M )
			{
				System.out.println(node.cnt);
				break;
			}
			//이동 가능한 (상태전이 가능한) 노드를 방문한 적 없다면, 큐에 삽입.
			for(int i = 0; i < 4; i++)
			{
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				
				if( arr[nx][ny] == 1 && !visited[nx][ny])
				{
					visited[nx][ny] = true;
					queue.add(new Node(nx, ny, node.cnt+1));
				}
			}
		}
	}
	
	
	
	static boolean[][] visited;
	static void dfs(int x, int y, int cnt)
	{			
		if( x == N && y == M)
		{
			System.out.println(cnt);
			return;
		}
		
		for(int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			//갔던 곳이 아니어야 하고, 길이 있어야함
			if(!visited[nx][ny] && arr[nx][ny] == 1 )
			{
				visited[nx][ny] = true;
				dfs(nx, ny, cnt+1);
				visited[nx][ny] = false;
			}
			
		}
	}
}
