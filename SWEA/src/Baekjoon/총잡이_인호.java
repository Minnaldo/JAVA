package Baekjoon;

import java.util.Scanner;

public class 총잡이_인호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			char[][] map = new char[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}			
			int count = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j] == 'G') {
						for (int k = j - 1; k >= 0; k--) { // left
							if(map[i][k] == 'T') {
								count++;
								map[i][k] = '0';
								break;
							}
							else if( map[i][k] == 'W') break;
							else if(map[i][k] == 'G') break;
						}
						for (int k = j + 1; k < map[i].length; k++) { // right
							if(map[i][k] == 'T') {
								count++;
								map[i][k] = '0';
								break;
							}
							else if( map[i][k] == 'W') break;
							else if(map[i][k] == 'G') break;
						}
						for (int k = i + 1; k < map.length; k++) { // down
							if(map[k][j] == 'T') {
								count++;
								map[k][j] = '0';
								break;
							}
							else if( map[k][i] == 'W') break;
							else if(map[k][i] == 'G') break;
						}
						for (int k = i - 1; k >= 0; k--) { // up
							if(map[k][j] == 'T') {
								count++;
								map[k][j] = '0';
								break;
							}
							else if( map[k][i] == 'W') break;
							else if(map[k][i] == 'G') break;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
}