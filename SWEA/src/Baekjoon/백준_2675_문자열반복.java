//백준_2675_문자열반복
package Baekjoon;

import java.util.Scanner;

public class 백준_2675_문자열반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int R = 0;
//		String S;
		int T = sc.nextInt();
		for(int i = 0; i < T; i++)
		{
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j = 0; j < S.length(); j++)
			{
				char[] c = S.toCharArray();
				for(int k = 0; k < R; k++)
				{
					System.out.print(c[j]);
				}
			}
			System.out.println();
		}
		
		
	}

}
