// SWEA_D1_2068. 최대수 구하기
package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int i = 0; i < TC; i++)
		{
			int max = 0;
			for(int j = 0; j < 10; j++)
			{
				int num = sc.nextInt();
				if(max < num)
					max = num;
			}
			System.out.println("#" + (i+1) + " " + max);
		}
	}
}