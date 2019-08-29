package Baekjoon;

import java.util.Scanner;

public class 백준_2563_색종이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[][] arr = new int[102][102];
		for(int tc = 0; tc < N; tc++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			for(int i = num1+1; i <= num1+10; i++)
			{
				for(int j = num2+1; j <= num2+10; j++)
				{
					arr[i][j] = 1;
				}
			}
						
		}
		for(int i = 0; i <= 100; i++)
		{
			for(int j = 0; j <= 100; j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
