package SWEA_D3;

import java.util.Scanner;

public class 백준_상근날드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
		for (int tc = 1; tc <= 1; tc++) {
			int[] arr = new int[3];
			int[] brr = new int[2];

			for(int i = 0; i < 3; i++)
				arr[i] = sc.nextInt();
			for(int i = 0; i < 2; i++)
				brr[i] = sc.nextInt();

			int min = 100000;
			int[] sum = new int[6];
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					sum[i+j] = arr[i]+brr[j];
					if(min > sum[i+j])
						min = sum[i+j];
				}
			}

			System.out.println(min-50);
		}
	}

}
