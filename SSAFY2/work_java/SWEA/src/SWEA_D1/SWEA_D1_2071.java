package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i = 0; i < tc; i++)
		{
			int sum = 0;
			int result = 0;
			
			for(int j = 0; j < 10; j++)
			{
				int num = sc.nextInt();
				sum += num;
			}						
			
			result = (int)(sum / 10.0 + 0.5);
			
			Math.round(result);
			System.out.println("#" + (i+1) + " " + result);
		}
	}
}
