//SWEA_D3_8338_계산기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_8338_계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();

			int[] arr = new int[num];
			for(int i = 0; i < num; i++)
			{
				arr[i] = sc.nextInt();
			}

			int sum = arr[0];
			for(int i = 1; i < num; i++)
			{
				if(sum==0||sum==1) {
					sum+=arr[i];
				}
				else if(arr[i]==0||arr[i]==1) {
					sum+=arr[i];
				}
				else {
					sum*=arr[i];
				}
			}

			System.out.println("#" + tc + " " + sum);
		}
	}

}
