package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue queue = new LinkedList<>();
		
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++)
		{
			queue.add(i);
		}

		while(true)
		{
			if(queue.size() == 1)
			{
				System.out.println(queue.peek());
				break;
			}
			
			queue.poll();
			
			if(!queue.isEmpty())
			{
				//처음 값을 맨 마지막 값으로 보내기...
				queue.add(queue.poll());
			}
			
			
		}
	}
}
