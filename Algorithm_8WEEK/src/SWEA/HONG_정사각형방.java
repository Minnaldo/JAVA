package SWEA;

import java.util.Scanner;

public class HONG_정사각형방 {

	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			map = new int[N+2][N+2];
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++)
					map[i][j] = sc.nextInt();
			}
			ans = new Ans(987654321, 0);
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++)
					dfs(i, j, 1, map[i][j]);
			}
			System.out.println("#" + tc + " " + ans.toString());
		}
	}
	static class Ans implements Comparable<Ans>{
		int start;
		int cnt;
		Ans(int s,int c){
			start = s;
			cnt = c;
		}
		@Override
		public int compareTo(Ans o) {
			// TODO Auto-generated method stub
			if( this.cnt == o.cnt )
				return this.start - o.start;
			return o.cnt - this.cnt;
		}
		public String toString() {
			return this.start + " " + this.cnt;
		}
	}
	static Ans ans;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static void dfs(int r, int c, int cnt, int start) {
		//기저파트가 없고. 항상 현재 상태의 출발지와 이동거리를 가지고. 정답을 계속해서 갱신 :)
		Ans tmp = new Ans(start, cnt);
		if( ans.compareTo(tmp) > 0 ) {
			ans = tmp;
		}
		
		
		for(int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			//다음 가려는 곳이 현재 위치보다 1만큼 더 크다면
			if( map[nr][nc] == map[r][c] + 1 ) {
				dfs(nr, nc, cnt+1, start);
			}
		}
	}
}