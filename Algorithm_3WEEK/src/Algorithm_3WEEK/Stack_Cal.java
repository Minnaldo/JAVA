package Algorithm_3WEEK;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result = 0;
			String input = sc.next();
			
			for(int i = 0; i < input.length(); i++)
			{
				/*배열
				input.toCharArray(); */
				
				/*배열 안 만들고
				char c = input.charAt(i); */
				
				//넌 숫자니? True  ->  숫자
				if(Character.isDigit(input.charAt(i)))
				{
					//input.charAt(i) 아스키코드값이 들어온다. '0'의 아스키코드값을 뺴주면 입력한 숫자의 아스키코드값을 받을수있다.
					stack.push(input.charAt(i) - '0');
				}
				//넌 숫자니? False  ->  문자
				else
				{
					int num1 = 0, num2 = 0;
					num2 = stack.pop();
					num1 = stack.pop();
					//6528-*2/+
					if(input.charAt(i) == '*')
					{
						System.out.println("#" + i + "  num1 * num2 = " + (num1*num2));
						stack.push(num1 * num2);
					}
					else if(input.charAt(i) == '/')
					{
						System.out.println("#" + i + "  num1 / num2 = " + (num1/num2));
						stack.push(num1 / num2);
					}
					else if(input.charAt(i) == '+')
					{
						System.out.println("#" + i + "  num1 + num2 = " + (num1+num2));
						stack.push(num1 + num2);	
					}
					else if(input.charAt(i) == '-')
					{
						System.out.println("#" + i + "  num1 - num2 = " + (num1-num2));
						stack.push(num1 - num2);	
					}

				}
				
			}
			
			System.out.println("연산 끝 : " + stack.pop());
		}
	}

}
