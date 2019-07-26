package SSAFY_study;

import java.util.Scanner;

public class 부분수열의합_재귀 {

	static int K;
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			K = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
				
			}
			
			subsum(arr, 0, 0);
			
			System.out.println("#" + tc + " " + count);
		}
	}
	
	static void subsum(int[] arr, int idx, int sum)
	{
		if( idx == arr.length)
		{
			if( sum == K )
			{
				count++;
			}
			return;
		}
		
		subsum(arr, idx + 1, sum);
		subsum(arr, idx + 1, sum + arr[idx]);
	}

}
