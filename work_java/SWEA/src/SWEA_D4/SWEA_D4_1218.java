package SWEA_D4;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_D4_1218 {
	// (), [], {}, <>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int result = 1;
			int input = sc.nextInt();
			String str = sc.next();

			for(int i = 0; i < input; i++)
			{
				char c = str.charAt(i);
				if(c == '(' || c == '[' || c == '{' || c == '<')
				{
					stack.push(c);
				}

				else{
					if(stack.peek() == '(' && c == ')') 
						stack.pop();

					else if(stack.peek() == '[' && c == ']')
						stack.pop();


					else if(stack.peek() == '{' && c == '}')
						stack.pop();


					else if(stack.peek() == '<' && c == '>')
						stack.pop();


					else {
						result = 0;
						break;
					}
					
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
