//2577. 백준_숫자의개수
package SWEA_D2;

import java.util.Scanner;

public class 백준_숫자의개수_Hong_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int mul = num1*num2*num3;
			
		int[] cnt = new int[10];
		while( mul > 0 )
		{
			cnt[mul % 10]++;
			mul /= 10;
		}
		
		for(int i = 0; i < 10; i++)
			System.out.println(cnt[i]);
	}
}
