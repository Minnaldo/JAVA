//SWEA_D1_2072. 홀수만 더하기
package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int i = 0; i < TC; i++)
		{
			int sum = 0;
			for(int j = 0; j < 10; j++)
			{
				int input = sc.nextInt();
				if( input % 2 == 1)
					sum += input;
			}
			
			System.out.println("#" + (i+1) + " " + sum);
		}
	}

}
