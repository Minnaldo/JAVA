//백준_1157_단어공부
package Baekjoon;

import java.util.Scanner;

public class 백준_1157_단어공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		int[] alphabet = new int[26];
		
		int max = 0;
		char result = '?';
		
		for(int i = 0; i < input.length(); i++)
		{
			alphabet[input.charAt(i) - 65]++;
			if(max < alphabet[input.charAt(i) - 65])
			{
				max = alphabet[input.charAt(i) - 65];
				result = input.charAt(i);
			}
			else if (max == alphabet[input.charAt(i) - 65])
			{
				result = '?';
			}
		}
		
		System.out.println(result);
	}

}
