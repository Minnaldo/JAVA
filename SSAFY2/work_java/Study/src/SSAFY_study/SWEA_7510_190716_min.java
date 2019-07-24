package SSAFY_study;

import java.util.Scanner;

public class SWEA_7510_190716_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
				
		int sum = 0;
		
		for(int i = 0; i < test_case; i++)
		{
			int result = 0;
			int case_num = sc.nextInt();
			int k=1;
			for (int j = 1; j <= case_num; j++)
			{
				sum += j;
				
								
				if(case_num <= sum)
					
				{
					if(case_num == sum)
					{
						result++;
					}
					sum = 0;
					j = k++;
				}
				
				
								
			}
			
			System.out.printf("#%d " + result, i);
		}
				
	}

}
