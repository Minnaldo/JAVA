//SWEA_D2_2001. 파리퇴치
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int result = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] input = new int[N][N];

			//값을 넣어 맵을 생성합니다.
			for (int i = 0; i < N; i++) 
			{
				for (int j = 0; j < N; j++) 
				{
					input[i][j] = sc.nextInt();
				}
			}
			
			int sum = 0, max = 0;
			// 총 맵 크기의 배열에서 파리채 크기만큼을 빼고 +1을 해주어 반복문
			// : 총 5x5 = 25 / 2x2배열을 다 검사하기 위해 4x4 만큼 검사해줘야함.
			//파리채 크기의 범위로 가능한만큼 전부 조사하며
			//max 변수에 최대값을 담아줌.
			for (int i = 0; i < N - M + 1; i++) 
			{
				for (int j = 0; j < N - M + 1; j++) 
				{
					sum = 0;
					
					//파리채 검사
					for (int k = 0; k < M; k++) 
					{
						for (int l = 0; l < M; l++) 
						{
							sum += input[i + k][j + l];
						}
					}

					if (max < sum)
						max = sum;

				}
			}

			System.out.println("#" + (tc + 1) + " " + max);

		}
	}

}
