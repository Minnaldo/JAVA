package Example;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		long start = System.currentTimeMillis();
		
		int sum = 0;
		
		for(int i = 1; i <= input; i++)
		{
			for(int j = i; j <= input; j++)
			{
				sum += j;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + "ms");
		System.out.println(sum);
	}
}
