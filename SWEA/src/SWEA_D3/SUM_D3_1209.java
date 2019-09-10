package SWEA_D3;

import java.util.Scanner;

public class SUM_D3_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			
			int[][] arr = new int[100][100];
			int[] sum = new int[202];
			for(int i = 0; i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			//가로합  0~99
			int k = 0;
			for(int i = 0; i < 100; i++)
			{
				for(int j = 0; j <100; j++)
				{
					sum[k] += arr[i][j];
				}
				k++;
			}
			
	
			//세로합 100~199
			for(int i = 0; i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					sum[k] += arr[j][i];
				}
				k++;
			}
			
			//대각선 왼->오 합 200
			for(int i = 0; i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					if(i == j)
					{
						sum[k] += arr[i][j];
					}
				}
			}
			k++;
			
			//대각선 오->왼 합 201
			for(int i = 99; i >= 0; i--)
			{
				for(int j = 99; j >= 0; j--)
				{
					if(i == j)
					{
						sum[k] += arr[i][j];
					}
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < 202; i++)
			{
				max = Math.max(sum[i], max);
			}
			
			System.out.println("#" + tc + " " +	max);
		}
	}

}
