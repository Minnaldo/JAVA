//SWEA_D3_1217. 4일차 - 거듭 제곱
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_1217 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int mul = num1;
			for(int i = 1; i < num2; i++)
			{
				mul *= num1;
			}
			
			System.out.println("#" + tc + " " + mul);
		}
	}
}
