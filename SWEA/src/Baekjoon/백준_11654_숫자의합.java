//백준_11654_숫자의합
package Baekjoon;

import java.util.Scanner;

public class 백준_11654_숫자의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		int result = 0;
		for(int i = 0; i < N; i++)
		{
			result += S.charAt(i) - '0';
			

		}
		
		System.out.println(result);
	}

}
