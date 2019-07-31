package SWEA_D2;

import java.util.Scanner;

public class SWEA_D3_1989_Hong_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			String str = sc.next();
//			//가운데 끝자락을 출력해보자.
//			System.out.println(str.charAt(str.length() / 2));
			
			int result = 1;	
			int mid = str.length() / 2;
			
			/** mid로부터 양쪽으로 i번째 있는 두 글자가 서로 같은지 검사하는데,
			 * 한번이라도 같지 않은 경우가 생기면 result = 0 으로 해서
			 * break : 회문이 아닌걸로!!!
			 */
			for(int i = 0; i < str.length() / 2 + 1; i++)
			{
				if( str.charAt(0 + i) != str.charAt(str.length() - 1 - i) )
				{
					result = 0;
					break;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
