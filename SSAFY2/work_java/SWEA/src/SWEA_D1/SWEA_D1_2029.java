package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
				
		for (int i = 1; i <= test_case; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int div = div = num1 / num2;
			int mod = mod = num1 % num2;
						
			System.out.println("#" + i + " " + div + " " + mod);
		}
	}
}
