package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 0; i <= input; i++)
		{
			int result = (int)(Math.pow(2,  i));
			System.out.print(result + " ");
			
		}
	}

}