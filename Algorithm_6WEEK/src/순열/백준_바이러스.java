package 순열;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_바이러스 {

	static int[][] arr;
	static int N;
	static int connectNum;
	static Scanner sc = new Scanner(System.in);
	static boolean[] visited;
	static Queue<Point> q = new LinkedList<Point>();
	static int cnt;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		connectNum = sc.nextInt();
		arr = new int[N+2][N+2];
		visited = new boolean[N+2];
		
		for(int i = 0; i < connectNum; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		visited[1] = true;
		for(int i = 1; i <= N; i++)
		{
			if(arr[1][i] == 1)
			{
				cnt++;
				q.add(new Point(1, i));
				visited[i] = true;
			}
		}
		BFS();
		System.out.println(cnt);
	}
	
	static void BFS()
	{
		while(!q.isEmpty())
		{
			Point n = q.poll();
			int nx = n.x;
			int ny = n.y;
			
			for(int i = 1; i <=N; i++)
			{
				if(arr[ny][i] == 1 && visited[i] == false)
				{
					cnt++;
					q.add(new Point(ny, i));
					visited[i] = true;
				}
			}
		}
	}

}
