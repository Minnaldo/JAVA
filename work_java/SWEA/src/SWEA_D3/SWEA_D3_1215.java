//SWEA_D3_1215. 3일차 - 회문1
package SWEA_D3;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D3_1215 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = 8;
			char[][] arr = new char[N][N];
			for(int i = 0; i < 8; i++)
			{
				String str = sc.nextLine();
				for(int j = 0; j < 8; j++)
				{
					arr[i][j] = str.charAt(i);
				}
			}
			
		}

	}

}
