//SWEA_D3_3142. 영준이와 신비한 뿔의 숲
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_3142_영준이와신비한뿔의숲 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int a, b;

			a = 2*M-N;
			b= N-M;

			System.out.println("#" + tc + " " + a + " " + b);

		}

	}

}
