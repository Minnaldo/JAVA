package Algorithm_3WEEK;

import java.util.Stack;

public class SWEA_D4_open_close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr = "6+2*(3+7)";
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			if( Character.isDigit(c) ) {
				sb.append(c);
			}
			else if( c == '(' ) {
				stack.push(c);
			}
			else if( c == '+') {
				while( !stack.empty() && stack.peek() != '(' ) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
			else if( c == '*' ) {
				while( !stack.empty() && stack.peek() != '+' && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
			else if( c == ')' ) {
//				char top = ' ';
//				if( !stack.empty())
//					top = stack.pop();
//				while( !stack.empty() && top != '(' ) {
//					sb.append(top);
//					top = stack.pop();
//				}
				
				char top;
				while( !stack.empty() && ( top = stack.pop()) != '(') {
					sb.append(top);
				}
				
			}
		}
		//스택에 있는거 다 빼서 출력
		while(!stack.empty())
			sb.append(stack.pop());
//			System.out.print(stack.pop());
		System.out.println(sb.toString());
	
	}
}
