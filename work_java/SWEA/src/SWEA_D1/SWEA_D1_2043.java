package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(num1 - num2 + 1);
		else
			System.out.println(num2 - num1 + 1);
	}
}
