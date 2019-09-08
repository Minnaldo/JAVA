//백준_1026_보물
package Baekjoon;

import java.util.Scanner;

public class 백준_1026_보물 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Arr = new int[N];
		int[] Brr = new int[N];
		int[] Crr = new int[N];

		for(int i = 0; i < N; i++)
		{
			Arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++)
		{
			Brr[i] = sc.nextInt();
		}

		int sum = 0;
		int min = 100000;
		int p = 0;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				sum += Arr[j+i] * Brr[j];
				
				
//				Crr[p] = sum;
//				p++;
			}
			
			int tmp = Arr[N-1]; 
			int Temp2 = 0;
			for(int k = 0; k < N-1; k++)
			{
				Temp2 = Arr[k];
				Arr[k] = Arr[k+1];
				Arr[0] = tmp;
			}
			System.out.println(Arr[i]);
		}

	}
}