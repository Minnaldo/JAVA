package Algorithm_2WEEK;

import java.util.Arrays;
import java.util.Scanner;

public class earthworm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				arr[i][j + (N-1-2*j) * (i % 2)] = count;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}