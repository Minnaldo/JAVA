package AD;

import java.util.Scanner;

public class 등산로조성_SWEA_1949 {

	static int T;
	static int N;
	static int K;
	static int[][] arr;
	static boolean[][] visited;
	static Scanner sc = new Scanner(System.in);

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			N = sc.nextInt();
			K = sc.nextInt();

			arr = new int[N][N];
			visited = new boolean[N][N];
			//입력을 받으면서, 최대값을 기억하고 있다가. 그 위치에서 탐색을 시작하자.
			int max = 0;
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					arr[i][j] = sc.nextInt();
					max = Math.max(max, arr[i][j]);
				}
			}
			
			MAX = 0;
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < N; j++)
				{
					if ( max == arr[i][j] )
					{
						dfs(i, j, arr[i][j], false, 1);


					}
				}
			}
			System.out.println("#" + tc + " " + MAX);
		}
	}

	static int MAX = 0;
	//상태노드의 정보는... 좌표(행.열). 그곳의 높이(이걸 들고다니면 까고 갔을때 계산이 쉬움). 땅까기 사용여부. 지금까지의 길이.
	static void dfs(int x,int y,int hight, boolean isUsed, int cnt) {
		visited[x][y] = true;
		MAX = Math.max(MAX, cnt);
		for(int i = 0 ; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < 0 || ny < 0 || ny >= N || nx >= N)
				continue;
			if( !visited[nx][ny] ) {
				if( arr[nx][ny] < hight )
					dfs(nx, ny, arr[nx][ny], isUsed, cnt+1);
				else if( !isUsed && arr[nx][ny] - K < hight ) {
					dfs(nx, ny, hight-1, true, cnt + 1);
				}
			}
		}


		visited[x][y] = false;
	}
}

