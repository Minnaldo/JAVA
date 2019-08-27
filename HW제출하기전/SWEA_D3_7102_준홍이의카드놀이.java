//SWEA_D3_7102_준홍이의카드놀이
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_7102_준홍이의카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N+M+2];
			int result = 0;
			for(int i = 1; i <= N; i++)
			{
				for(int j = 1; j <= M; j++)
				{
					arr[i+j]++;
				}
			}
			
			int max = 0;
			for(int i = 1; i <= N+M; i++)
			{
				if(arr[i] > max)
				{
					max = arr[i];
				}
			}
			
			System.out.print("#" + tc);
			for(int i = 1; i <= N+M; i++)
			{
				if(arr[i] == max)
					System.out.print(" " + i);
			}
			System.out.println();
		}

	}

}
