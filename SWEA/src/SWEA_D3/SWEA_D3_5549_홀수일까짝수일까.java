//SWEA_D3_5549_홀수일까짝수일까
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5549_홀수일까짝수일까 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String num = sc.next();
			char[] c = num.toCharArray();
			
			if(c[c.length-1] % 2 == 1)
				System.out.println("#" + tc + " Odd");
			else if(c[c.length-1] % 2 == 0)
				System.out.println("#" + tc + " Even");
		}

	}

}
