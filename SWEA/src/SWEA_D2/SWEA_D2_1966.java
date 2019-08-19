//SWEA_D2_1966. 숫자를 정렬하자.
package SWEA_D2;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D2_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int[] input = new int[num + 1];
			for(int i = 0; i < num; i++)
			{
				input[i] = sc.nextInt();
			}
			
			Arrays.sort(input);
			
			System.out.print("#" + tc);
			for(int i = 0; i < num; i++)
			{
				System.out.print(" " + input[i]);
			}
			System.out.println();
		}
	}

}
