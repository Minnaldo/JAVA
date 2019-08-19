//SWEA_D3_3314. 보충학습과 평균
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_3314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int[] arr = new int[5];
			int sum = 0;
			int result_avg = 0;
			for(int i = 0; i < 5; i++)
			{
				arr[i] = sc.nextInt();
				if(arr[i] < 40)
					arr[i] = 40;
				
				sum += arr[i];
			}
			
			result_avg = sum / 5;
			
			System.out.println("#" + tc + " " + result_avg);
			
			
		}

	}

}
