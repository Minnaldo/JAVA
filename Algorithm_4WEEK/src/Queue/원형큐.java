package Queue;

import java.util.Scanner;

public class 원형큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5칸 쓰고 싶다면 6칸 만들어야 함.
		int[] queue = new int[6];
		int front = 0;
		int rear = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.enQueue\n2.deQueue\n0.End");
			int sel = sc.nextInt();
			int num = 0;
			if ( sel == 1)
			{
				num = sc.nextInt();
				//num을 큐에 삽입
				//rear = (real+1) mod N 하고 그 자리에 삽입
				//rear:삽입부, front:삭제부
				
				//큐가 full이면 full이라고 출력, 아니면 삽입
				if(front == (rear + 1) % 6)
				{
					System.out.println("isFull!!");
				}
				else
				{
					front = (front + 1) % num;
					System.out.println(queue[front + 1]);
				}
			}
			else if (sel == 2)
			{
				//큐가 공백이면 공백이라고 출력, 아니면 인출
				if (front == rear)
				{
					System.out.println("isEmpty!!");
				}
			}
		
			else if (sel == 0)
				break;
		}
	}

}
