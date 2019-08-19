//SWEA_D2_2007_Hong_Solution. 패턴 마디의 길이
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_2007_Hong_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) 
		{
			/* 첫번째 1글자가 그다음 1글자와 같은가?
			 * 첫번째 2글자가 그다음 2글자와 같은가?
			 * 첫번째 3글자가 그다음 3글자와 같은가?
			 * ...
			 * ... 한번이라도 걸리면 현재 그 글자수를 출력
			 */

			String text = sc.next();
			int len = 0;
			for(int i = 1; i <= 10; i++)
			{
				String str  = text.substring(0,i);
				String next = text.substring(i,i+i);
				if(str.equals(next)) 
				{
					len = i;
					break;
				}
			}
			System.out.println("#" + tc + " "+ len);
		}

	}

}
