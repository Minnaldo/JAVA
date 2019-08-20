//SWEA_D3_6730. 장애물 경주 난이도
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_6730_장애물경주난이도 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i = 0; i < N; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			int max = 0, min = 0;
			int up = 0, down = 0;
			for(int i = 0; i < arr.length - 1; i++)
			{
				if(arr[i] < arr[i+1])
				{
					up = arr[i+1] - arr[i];
					if(max < up)
						max = up;
				}
				
				else if(arr[i] > arr[i+1])
				{
					down = arr[i] - arr[i+1];
					if(min < down)
						min = down;
				}
			}
			
			System.out.println("#" + tc + " " + max + " " + min);
		}

	}

}
