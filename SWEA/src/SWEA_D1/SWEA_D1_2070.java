//SWEA_D1_2070. 큰 놈, 작은 놈, 같은 놈
package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int i = 1; i <= TC; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 < num2)
				System.out.println("#" + i + " <");
			else if(num1 == num2)
				System.out.println("#" + i + " =");
			else if (num1 > num2)
				System.out.println("#" + i + " >");
		}
	}

}
