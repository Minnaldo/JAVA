package TEST;

import java.util.Scanner;

public class gun {

	static int T;
	static int N;
	static int M;
	static Scanner sc = new Scanner(System.in);
	static char[][] arr;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static boolean inArr (int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < M;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			arr = new char[N][M];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					arr[i][j] = sc.next().charAt(0);
				}
			}
		
			
			int result = 0;
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < M; j++) {
					if(arr[i][j] == 'G') {
						result += shoot(i, j);
					}
				}
			}
			
		}
	}

	
	static int shoot(int x, int y) {
		
	}
}

/*
2
5 7
T 0 T 0 G 0 G
0 W T W W W 0
T W G 0 T W T
0 0 0 T G W 0
0 0 T 0 0 W 0
*/