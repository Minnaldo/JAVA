//SWEA_D3_3499. 퍼펙트 셔플
package SWEA_D3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D3_3499 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		LinkedList<String> list = new LinkedList<>();
//		LinkedList<String> list22 = new LinkedList<>();
		//		LinkedList<Integer> list = new LinkedList<>();

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) 
		{
			Queue<String> queue1 = new LinkedList<>();
			Queue<String> queue2 = new LinkedList<>();
			Queue<String> result_queue = new LinkedList<>();
			int num = sc.nextInt();
			int idx = num % 2 == 0 ? num/2 : num/2+1;
			for(int i = 0; i < idx; i++)
			{
				//				list.add(sc.next());
				queue1.add(sc.next());
			}
			for(int i = 0; i < num / 2; i++)
			{
				queue2.add(sc.next());
			}
			
			
			for(int i = 0; i < idx-1; i++)
			{
				result_queue.add(queue1.poll());
				result_queue.add(queue2.poll());
			}
			if(num%2 == 0) {
				result_queue.add(queue1.poll());
				result_queue.add(queue2.poll());
			}else {
				result_queue.add(queue1.poll());
			}

			System.out.print("#" + tc);
			for(int i = 0; i < num; i++)
			{
				System.out.print(" " + result_queue.poll());
			}
			System.out.println();
		}
	}
}
//			String temp, temp2;
//			
//			for(int i = 0; i < (num/2)-1-i; i++)
//			{
//				temp = arr[num/2];
//				arr[i+2] = arr[i+1];
//			}
//			
//			
//			for(int i = 0; i < num; i++)
//			{
//				System.out.print(" " + arr[i]);
//			}
//			
////			temp2 = arr[1];
////			arr[1] = temp;
	

//			list22 = list;
//			//A D B C E F
//			for(int i = 0; i < 1; i++)
//			{
//				list.set((i+1), list.get(num/2));
//			}
//			
//			for(int i = 0; i < num; i++)
//			{
//				list22.add(i+2, list.get(i+1));
//			}
//			
//			
//			for(int i = 0; i < num; i++)
//			{
//				System.out.print(" " + list.get(i));
//			}
//			System.out.println();
//			System.out.println("2222");
//			
//			for(int i = 0; i < num; i++)
//			{
//				System.out.print(" " + list22.get(i));
//			}

