package Algorithm_3WEEK;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Calculator2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int tc=1; tc<=T; tc++) {
			Stack<Character> stack = new Stack<>();
			Stack<Integer> stackint = new Stack<>();
			int num = sc.nextInt();
			String input = sc.next();
			String str = "";
			
			for(int i=0; i<num; i++) {			
				if(Character.isDigit(input.charAt(i)))
					str += input.charAt(i);
				
				else{
					if(input.charAt(i) == '+')
						while(!stack.isEmpty()) {
							str+= stack.pop();
						}
					else {					
						if(!stack.empty()&&(stack.peek() != '+'))
							while(!stack.empty() && (stack.peek()!='+')) {
								str+= stack.pop();
							}
					}
					stack.push(input.charAt(i));
				}
			}			
			
			while(!stack.isEmpty()) {
				str+= stack.pop();
			}
			
			for(int i=0; i<num; i++) {			
				if(Character.isDigit(str.charAt(i))){
					stackint.push(str.charAt(i) - '0');
				}
				else{
					int num1 = 0, num2 = 0;
					num2 = stackint.pop();
					num1 = stackint.pop();
					if(str.charAt(i) == '*')
						stackint.push(num1*num2);
					else if(str.charAt(i) == '+')
						stackint.push(num1+num2);
				}
			}			
			System.out.println("#" + tc + " " + stackint.pop());
		}
	}
}