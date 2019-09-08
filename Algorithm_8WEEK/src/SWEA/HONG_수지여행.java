package SWEA;

import java.util.Scanner;

public class HONG_수지여행 {

	static int T;
	static Scanner sc = new Scanner(System.in);
	static char[][] map;
	static boolean[] visited;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			
		}
	}
	
	static int max = 0;
	static void dfs(int x, int y, int cnt)
	{
		if(max < cnt)
			max = cnt;
		
		//4방으로 새로운 좌표를 구해서.
		for(int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
		
		//맵 밖으로 나가게 되면 컨티뉴
		if( nx < 0 || ny < 0 || nx >= map.length || ny >= map[nx].length )
			continue;
		//이미 방문한 문자면 컨티뉴
		if( !visited[ map[nx][ny] - 65 ] )
		{
			visited[map[nx][ny]-65] = true;
			dfs(nx, ny, cnt+1);
			visited[map[nx][ny]-65] = false;
		}
		//해당 문자를 방문한거로 체크하고
		//재귀 호출
		//해당 문자 방문 체크를 지움.
		}
	}
	

}
