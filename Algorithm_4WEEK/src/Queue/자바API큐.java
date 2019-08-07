package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class 자바API큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enQueue, deQueue 만 할 수 있게 구현되어있음.
		Queue<String> queue = new LinkedList<>();
		
		//넣기
		queue.add("삽입");
		
		//빼기
		System.out.println(  queue.poll()  );
		
		//안빼고 다음 빠질거 확인만
		System.out.println(  queue.peek()  );
	}

}
