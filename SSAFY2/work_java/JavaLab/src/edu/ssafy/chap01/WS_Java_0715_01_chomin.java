package edu.ssafy.chap01;

import java.util.Scanner;

public class WS_Java_0715_01_chomin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alpa1 = 65;
		
		for (int i = 0; i < 5; i++)
		{
			for ( int j = 0; j < i + 1; j++)
			{				
//				// 숫자 -> 문자
				
				char calpa = (char)alpa1;
				System.out.print(calpa);
				alpa1++;
//				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===================");

		
		
		
		int alpa2 = 65;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5 - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				char calpa = (char)alpa2;
				System.out.print(calpa);
				alpa2++;
			}
			System.out.println();
		}
		

	}

}
