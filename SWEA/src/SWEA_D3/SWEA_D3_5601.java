//SWEA_D3_5601. 쥬스 나누기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			
			System.out.print("#" + tc);
			for(int i = 1; i <= num; i++)
			{
				System.out.print(" " + 1 + "/" + num);
			}
			System.out.println();
		}
	}
}
