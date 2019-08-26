//백준_10809_알파벳찾기
package Baekjoon;

import java.util.Scanner;

public class 백준_10809_알파벳찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < alphabet.length; i++)
		{
			alphabet[i] = -1;
		}
		
		char[] c = input.toCharArray();
		for(int i = 0; i < c.length; i++)
		{
			int temp = c[i] - 97;
			if(alphabet[temp] == -1)
				alphabet[temp] = i;
		}
		
		for(int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
		
//		for(char c = 'a'; c <= 'z'; c++)
//		{
//			System.out.print(input.indexOf(c) + " ");
//		}
	}

}


// BAEKJOON
// A B  C  D E  F  G  H  I J K  L M  N O  P  Q  R  S  T  U  V  W  X  Y  Z
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
