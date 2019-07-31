package Algorithm_3WEEK;

import java.util.Scanner;
import java.util.Stack;

public class Stack_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		String input = sc.next();
		
		//문자열을 탐색하면서,, -> 문자열 길이만큼 반복문 수행.
		char[] cArr = input.toCharArray();
		for(int i = 0; i < cArr.length; i++)
		{
			char c = input.charAt(i);
			/** Java APi 제공 클래스로 객체 생성합니다.
			 * 제네릭인데, 스택에 담길 자료들의 자료형은?
			 * 한 글자를 저장할거니까 Character
			 */
			
			//지금 탐색하는 저 문자가 'C' 인지 검사
			if( c == '(' )
			{
				//스택에 푸쉬한다.
				stack.push(c);
			}
			else if ( c == ')')
			{
				//스택에서 하나 팝한다.
				if(stack.empty())
				{
					System.out.println("잘못된 괄호입니다.");
				}
				else
					stack.pop();
			}
		}
		
		//한바퀴 다 탐색한 후에, stack이 비어있으면 성공 아니면 실패!
		if (stack.empty())
		{
			System.out.println("정살적인 괄호입니다.");
		}
		else
		{
			System.out.println("잘못된 괄호입니다.");
		}
	}

}
