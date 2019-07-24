package edu.ssafy.chap01;

import java.util.Random;
import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean b = false;		//default 값은 false;
		int a = 3;
//		if(a >= 2) {
//			System.out.println("A");
//		}
//		char c = 'a';
		
//		System.out.println((int)'B');
		
//		String str = "str";
		
		//문자는 그냥 next
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		String b = sc.next();
		System.out.println(b);
		switch(a / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
			
		default:
			System.out.println("F");
			break;
		}
	}
}
