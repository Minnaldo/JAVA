//SWEA_D3_5162_두가지빵의딜레마
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5162_두가지빵의딜레마 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			int num1, num2;
			int result = 0;
			
			num1 = C/A;
			num2 = C/B;
			
			if(num1 > num2)
			{
				result = num1;
				System.out.println("#" + tc + " " + result);
			}
			else
			{
				result = num2;
				System.out.println("#" + tc + " " + result);
			}
		}
	}

}
