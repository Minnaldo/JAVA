package SWEA_D2;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D2_1954_Hong {

	public static void main(String[] args) {
		// N 이 4라면...

		// 오른쪽으로 4번
		// 아래쪽으로 3번
		// 왼왼쪽으로 3번
		// 위위쪽으로 2번
		// 오른쪽으로 2번

		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		int[][] arr = new int[N][N];
		int r = 0, c = -1;
		int val = 1;
		while (val != 26) {
			for (int i = 0; i < N; i++) {
				c++;
				arr[r][c] = val++;
			}
			N--;
			for (int i = 0; i < N; i++) {
				r++;
				arr[r][c] = val++;
			}
			for (int i = 0; i < N; i++) {
				c--;
				arr[r][c] = val++;
			}
			N--;
			for (int i = 0; i < N; i++) {
				r--;
				arr[r][c] = val++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(Arrays.toString(arr[i]));

//			// TODO Auto-generated method stub
		//
//			Scanner sc = new Scanner(System.in);
		//
//			int T = sc.nextInt();
		//
//			for (int tc = 1; tc <= T; tc++) {
//				int length = sc.nextInt();
//				int output = length;
//				int[][] array = new int[length][length];
//				int SW = 1; //+1행과 열의 증가, -1행과 열의 감소
//				int i = 0, j = -1;
//				int k = 1; //값
		//
//				while (true) {
		//
//					for (int c = 0; c < length; c++) {
//						j = j + SW;
//						array[i][j] = k;
//						k = k + 1;
//					}
		//
//					length = length - 1;
//					if (length == 0)
//						break;
		//
//					for (int c = 0; c < length; c++) {
//						i = i + SW;
//						array[i][j] = k;
//						k = k + 1;
//					}
		//
//					SW = SW * (-1); //스위치
//				}
//				
//				System.out.println("#"+ tc);
		//
//				for (i = 0; i < output; i++) {
//					for (j = 0; j < output; j++) {
//						System.out.print(array[i][j] + " ");
//					}
//					System.out.println();
//				}
//			}
	}
}
