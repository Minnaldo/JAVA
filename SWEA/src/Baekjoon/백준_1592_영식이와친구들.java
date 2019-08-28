package Baekjoon;

import java.util.Scanner;

public class 백준_1592_영식이와친구들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] arr = new int[N];
		
		int cnt = 1;
		arr[0] = 1;
		for(int i = 0; i < N*2+1; i++)
		{
			
			
			if(arr[i] % 2 == 1)
			{
				if(arr[i+L] < N)
				{
					arr[i] = arr[N-i];
					arr[i]++;
				}
//				arr[i+L]++;
			}
			
			
		}
	}

}
