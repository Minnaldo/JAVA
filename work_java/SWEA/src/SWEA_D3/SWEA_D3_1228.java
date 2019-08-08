//SWEA_D3_1228. 8일차 - 암호문1
package SWEA_D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_D3_1228 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			LinkedList<Integer> list = new LinkedList<>();
			int N = sc.nextInt();
			for(int i = 0; i < N; i++)
			{
				list.add(sc.nextInt());
			}
			
			int command_num = sc.nextInt();
			
			for(int i = 0; i < command_num; i++)
			{
				String insert = sc.next();
				int location = sc.nextInt();
				int add_num = sc.nextInt();
				for(int j = 0; j < add_num; j++)
				{
					int insert_num = sc.nextInt();
					list.add(location, insert_num);
					location++;
				}
				
				
			}
			
			System.out.print("#" + tc);
			for(int j = 0; j < 10; j++)
			{
//				System.out.print(" " + list.poll());
				System.out.print(" " + list.get(j));
			}
			System.out.println();
		}
	}

}
