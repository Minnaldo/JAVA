package Baekjoon;

import java.util.Scanner;

public class 보물 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] brr = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++)
		{
			brr[i] = sc.nextInt();
		}
		
		//S=A[0]*B[0] + ... + A[N-1]*B[N-1]
		
		int sum = 0, min = 100000;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
//				if((j+i) > N && (j+i) % N == i)
//				{
//					sum += arr[0]*brr[N-1];
//				}
//				System.out.print((j+i) % N + " ");
//				else
					sum += (arr[(j+i) % N] * brr[j]);
			}
//			System.out.println(sum);
			min = Math.min(min, sum);
			sum = 0;
		}
		System.out.println(min);
	}
	
}
