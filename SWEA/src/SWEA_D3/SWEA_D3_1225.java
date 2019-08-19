//SWEA_D3_1225. 7일차 - 암호생성기
package SWEA_D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D3_1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		

		for (int tc = 1; tc <= 10; tc++) {
			Queue<Integer> queue = new LinkedList<Integer>();
			boolean flag = false;
			
			int T = sc.nextInt();
			for(int i = 0; i < 8; i++)
			{
				queue.add(sc.nextInt());
			}
			
			int check = 1;
			while(true)
			{
				for(int i = 1; i <= 5; i++)
				{
					check = queue.peek();
					check -= i;
					queue.poll();
					if(check <= 0)
					{
						queue.add(0);
						flag = true;
						break;
					}
					queue.add(check);

				}

				if(flag)
					break;

			}
			
			System.out.print("#" + tc);
			for(int i = 0; i < 8; i++)
			{
				System.out.print(" " + queue.poll());
			}
			System.out.println();

		}
	}

}
