//SWEA_D2_1859. 백만 장자 프로젝트
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1859 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int max = 0, idx = 0, k = 0;
			long result = 0;
			
			for(int i = 0; i < N; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			while(true)
			{
				max = 0;
				idx = 0;
				for(int i = k; i < arr.length; i++)
				{
					if(max < arr[i])
					{
						max = arr[i];
						idx = i;
					}
				}
				
				for(int i = k; i < idx; i++)
				{
					if(arr[i] < max)
					{
						result += (max - arr[i]);
						arr[i] = -1;
					}
				}

				arr[idx] = -1;
				k = idx + 1;
				
				if(arr[N-1] == -1)
					break;
				
			}
			System.out.println("#" + tc + " " + result);
		}

	}

}

