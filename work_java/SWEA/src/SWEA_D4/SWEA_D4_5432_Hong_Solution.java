package SWEA_D4;

import java.util.Scanner;

public class SWEA_D4_5432_Hong_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			int result = 0;
			int stick = 0;
			
			for(int i = 0; i < input.length(); i++)
			{
				char c = input.charAt(i);
				
				
				if( c == '(' )
				{
					//내가 열림
					char next_char = input.charAt(i+1);
					if( next_char == '(' )
					{
						stick++;
					}
				}
				else if ( c == ')' )
				{
					char pre_char = input.charAt(i-1);
					if (pre_char == '(')
					{
						result += stick;
					}
					else if(pre_char == ')')
					{
						stick--;
						result++;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
