//SWEA_D3_1213. 3일차 - String
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			String find_str = sc.next();
			String str = sc.next();
			
			int cnt = 0;
			for(int i = 1; i < str.length() - 2; i++)
			{
				String str_second = str.substring(i, i+2);
				if(find_str.equals(str_second))
				{
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
