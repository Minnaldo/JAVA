package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_마이쮸 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		
		int input = sc.nextInt();
		int num = 1;
		int[] check = new int[input];
				
		while(true)
		{
			queue.add(num);
			int poll = queue.poll();
			
			for(int i = 1; i<=check[poll] + 1; i++)
			{
				input--;
				if(input == 1)
				{
					System.out.println("마지막으로 들고간 사람 : " + queue.peek());
				}
				
			}
			
			queue.add(poll);
			check[poll]++;
			num++;
			if(input == 1)
				break;
			
//			System.out.println("*********************");
//			for(int i = 1; i <= input; i++)
//			{
//				System.out.println(check[i]);
//			}
		}
	}

}
