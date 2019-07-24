package edu.ssafy.chap01;

import java.util.Scanner;

public class AlpaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpa1 = 65;
		
		for (int i = 0; i < 5; i++)
		{
			for ( int j = 0; j < i + 1; j++)
			{		
				char calpa = (char)alpa1;
				System.out.print(calpa);
				alpa1++;
			}
			System.out.println();
		}	
	}
}
