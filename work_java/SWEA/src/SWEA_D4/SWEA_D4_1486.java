//SWEA_D4_1486. 장훈이의 높은 선반
package SWEA_D4;

import java.util.Scanner;

public class SWEA_D4_1486 {
	static int min = 1000000;

	public static void main(String[] args) {
		//			int[] arr = {3,5,1};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int H = sc.nextInt();
			int[] num_H = new int[num];
			for(int i = 0; i < num; i++)
			{
				num_H[i] = sc.nextInt();
			}

			powerset(num_H, 0, new boolean[num_H.length], H);

			System.out.println("#" + tc + " " + (min - H));
			min = 1000000;
		}


	}

	static void powerset(int[] num_H, int idx, boolean[] sel, int H)
	{
		int sum = 0;
		if(idx == num_H.length)
		{
			for(int i = 0; i < num_H.length; i++)
			{
				if(sel[i])
				{
					sum += num_H[i];
				}
			}
			if(sum >= H)
			{
				if(min > sum)
				{
					min = sum;
				}
			}

			return;
		}
		sel[idx] = true;
		powerset(num_H, idx+1, sel, H);
		sel[idx] = false;
		powerset(num_H, idx+1, sel, H);
			
	}

}
