package Baekjoon;

import java.util.Scanner;
public class 태호_총잡이 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] arr = new char[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					arr[i][j] = sc.next().charAt(0);
				}
			}
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] == 'G') {
						// 가로
						// 왼쪽
						for (int j2 = j-1; j2 >= 0; j2--) {
							if (arr[i][j2] == 'T') {
								count++;
								arr[i][j2]=2;
								break;
							} 
							else if (arr[i][j2] == 'W') {
								break;
							} 
							else if (arr[i][j2] == 'G') {
								break;
							}
						}
						// 오른쪽
						for (int j2 = j+1; j2 < M; j2++) {
							if (arr[i][j2] == 'T') {
								count++;
								arr[i][j2]=2;
								break;
							} 
							else if (arr[i][j2] == 'W') {
								break;
							} 
							else if (arr[i][j2] == 'G') {
								break;
							}
						}
						//                  //세로위쪽
						for (int j3 = i-1; j3 >= 0; j3--) {
							if (arr[j3][j] == 'T') {
								count++;
								arr[j3][j]=2;
								break;
							} 
							else if (arr[j3][j] == 'W') {
								break;
							} 
							else if (arr[j3][j] == 'G') {
								break;
							}
						}
						// 아래쪽
						for (int j3 = i+1; j3 < N; j3++) {
							if (arr[j3][j] == 'T') {
								count++;
								arr[j3][j]=2;
								break;
							} 
							else if (arr[j3][j] == 'W') {
								break;
							} 
							else if (arr[j3][j] == 'G') {
								break;
							}
						}
					}
				}
			}
			System.out.println("#" + tc + " " + count);
		}
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
2 10
T W 0 G 0 W 0 G 0 W
G 0 T W T 0 T W T 0
 */