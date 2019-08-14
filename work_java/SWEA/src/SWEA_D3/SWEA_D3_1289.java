//SWEA_D3_1289. 원재의 메모리 복구하기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_1289 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int cnt = 0;
			
			char[] c = new char[str.length()];
			
			for(int i = 0; i < c.length; i++)
			{
				c[i] = '0';					
			}
			
			for(int i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) != c[i])
				{
					for(int j = i; j < c.length; j++)
					{
						c[j] = str.charAt(i);
					}
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
