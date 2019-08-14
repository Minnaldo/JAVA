//SWEA_D3_3431
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_3431 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			int result = 0;
			
			if( X < L )
				result = L - X;
			else if( L <= X && X <= U )
				result = 0;
			else if( X > U )
				result = -1;
			
			System.out.println("#" + tc + " " + result);
		}
	}
}
