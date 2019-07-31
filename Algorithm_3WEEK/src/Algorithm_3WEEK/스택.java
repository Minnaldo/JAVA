package Algorithm_3WEEK;

import java.util.Arrays;
import java.util.Scanner;

public class 스택 {

	public static void main(String[] args) {
		//스택에 저장될 잘료를 담을 공간을 준비 -> 1차원 배열.
		int[] stack = new int[5];
		
		//마지막에 삽입된 원소의 위치를 기억하는 변수   -1은 공백상태
		int top = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Push (입력 예 : 1 10 )\n 2.Pop (입력 예 : 2)\n 0. 종료");
			int sel = sc.nextInt();
			
			if( sel == 0)
				break;
			else if(sel == 1)
			{
				if(top > stack.length)
				{
					System.out.println("스택 오버플로우다 이놈아!!!");
					break;
				}
				else
				{
					top++;
					stack[top] = sc.nextInt();
				}
					
			}
			else if (sel == 2)
			{
				if(top == 0)
					System.out.println("언더플로우!!!");
				else
				{
					stack[top] = 0;
					top -= 1;
				}
			}
			
			for(int test : stack)
			{
				System.out.print(test + " ");
			}
			System.out.println();
		}
	}

}
