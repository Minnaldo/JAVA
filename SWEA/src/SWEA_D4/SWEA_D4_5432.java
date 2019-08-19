//SWEA_D4_5432. 쇠막대기 자르기.
package SWEA_D4;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_D4_5432 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			int bar_count = 0;
			int razer_cut_count = 0;

			char[] cArr = input.toCharArray();
			for (int i = 0; i < cArr.length; i++) {

				if (cArr[i] == '(' && cArr[i + 1] == ')') 
				{
					razer_cut_count += bar_count;
					i++;
				} 
				else if (cArr[i] == '(') {
					bar_count++;
				}

				else if (cArr[i] == ')') {
					razer_cut_count++;
					bar_count--;
				}

			}

			System.out.println("#" + tc + " " + razer_cut_count);
		}
	}

}
