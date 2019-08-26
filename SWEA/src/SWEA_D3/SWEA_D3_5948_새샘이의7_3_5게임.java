//SWEA_D3_5948_새샘이의7_3_5게임
package SWEA_D3;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D3_5948_새샘이의7_3_5게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[7];
			for(int i = 0; i < 7; i++)
				arr[i] = sc.nextInt();
			
			int[] sum = new int[100];
			int l = 0;
			for(int i = 0; i < 7; i++)
			{
				for(int j = i+1; j < 7; j++)
				{
					for(int k = j+1; k < 7; k++)
					{
						sum[l] += (arr[i] + arr[j] + arr[k]); 
						l++;
					}
				}
			}
			
			Arrays.sort(sum);
			
			int max = 0;
			for(int i = 0; i < 100; i++)
			{
				if(sum[i] > max)
					max = sum[i];
			}
			
			
			
			for(int i = 0; i < 100; i++)
				System.out.print(sum[i] + " ");
			
//			System.out.println("#" + tc + " " + sum[99-5]);
		}

	}

}
