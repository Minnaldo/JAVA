//SWEA_D2_1986. 지그재그 숫자
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int result = 0;

			if(num % 2 == 0)
				result = num / 2 * (-1);
			else
				result = (num + 1) / 2;

			System.out.println("#" + tc + " " + result);
		}
	}
}
