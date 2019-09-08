package AD;

import java.util.Scanner;

public class SWEA_D4_7733_치즈도둑 {

	static int T;
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static boolean inArr (int x, int y)
	{
		return x>=0&&y>=0&&x<N&&y<N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			
			arr = new int[N+2][N+2];
			for(int i = 1; i <= N; i++)
			{
				for(int j = 1; j <= N; j++)
				{					
					arr[i][j] = sc.nextInt();
				}
			}
			
			//1부터 100까지..  에 대해서 유기농 배추짓을 할건데, 그 중 가장 큰 값을 기억해야되는데, 그 값을 기억할 변수
			int max = Integer.MIN_VALUE;
			for(int i = 1; i <= 100; i++)
			{
				//현재 1~100중의 값으로 세어진 덩어리 갯수를 저장할 변수
				int cnt = 0;
				visited = new boolean[N+2][N+2];
				//탐색하여 갯수를 센다.
				for(int r = 1; r <= N; r++)
				{
					for(int c = 1; c <= N; c++)
					{
						//i보다 큰 값이 보이면, 덩어리 발견으로 하나 세고
						if( arr[r][c] > i && !visited[r][c])
						{
							cnt++;
							//같은 덩어리에 들어가는 칸은 탐색하며 무효화
							dfs(r, c, i);
						}
					}
				}
				//최대값 갱신
				max = Math.max(max, cnt);
			}
	
			
			System.out.println("#" + tc + " " + max);
		}
	}
	
	
	//상태공간트리에서 노드가 갖는 상태값은 현재 좌표값과 기준값 (몇 이상의 값을 찾고 있는지...)
	static void dfs(int x, int y, int val)
	{
		visited[x][y] = true;
		for(int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if( arr[nx][ny] > val && !visited[nx][ny])
				dfs(nx, ny, val);
		}
	}

}
