package Algorithm_3WEEK;

import java.io.Serializable;

class MyStackOverFlowException extends RuntimeException{
	

}

class MyStackEmptyException extends RuntimeException
{
	
}

public class MyStack<T> implements Serializable{
	//필요한 상태값은 배열과 위치변수
	private T[] stack;
	private int top;
	
	//최대 스택의 크기를 매개변수로 받아왔음.
	public MyStack(int size)
	{
		//제네릭이 적용된 스택이 만들어짐.
		stack = (T[])new Object[size];
//		stack = new int[size];
		top = -1;
	}
	
	
	/**필요한 기능은 push 와 pop */
	
	/*정수 데이터를 하나 받아서  푸쉬하고 싶은데
	 * 입력을 직접받으면 로직과 꼬여버리니까...
	 * 매개변수로 받자.. UI담당자가 받아다 주겠지!!!
	 */
	public void push(T data)
	{
		/*사용자 정의 예외를 사용하는 이유는
		이런 스택 꽉 찬 상황에 대해서 직접 대응하면
		UI코드가 일로 들어오거나  ... 등등...
		상황만 알려주면 저 예외를 catch해서 UI단에서 원하는 대응을 하도록.  */
		if( top >= stack.length -1)
			throw new MyStackOverFlowException();
		
		top++;
		stack[top] = data;
	}
	
	public T pop()
	{		
		if( top < 0 )
			throw new MyStackEmptyException();
		
		return stack[top--];
	}
	
	
}
