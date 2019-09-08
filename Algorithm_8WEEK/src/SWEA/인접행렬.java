package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class 인접행렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			int[][] arr = new int[a+1][b+1];
			
			for(int i = 0; i < b; i++)
			{
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int value = sc.nextInt();
				arr[num1][num2] = value;
			}

			for(int i = 0; i < b; i++)
			{
				for(int j = 0; i < a; i++)
				{
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}


		}
	}

}
