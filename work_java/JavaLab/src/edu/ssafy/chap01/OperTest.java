package edu.ssafy.chap01;

import java.util.Random;

public class OperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, oper1 = 15, oper2 = 12;
		sum = oper1 + oper2;
		int min = oper1 - oper2;
		int mul = oper1 * oper2;
		//float���� ĳ�����ؼ� ����ȯ ���Ѽ� �ؾ� �Ǽ������� ��µ�.
		float div = (float)oper1 / (float)oper2;
		int mod = oper1 % oper2;
		
//		System.out.println(sum);
//		System.out.println(min);
//		System.out.println(mul);
//		System.out.println(div);
//		System.out.println(mod);		
		
		
		oper1++;
		oper1--;
		
		/*
		Random r = new Random();
		//nextInt�� ������������ ��������.
		
		int val1 = r.nextInt(100) % 45 + 1;
//		int val2 = r.nextInt(100) % 45 + 1;
//		int val3 = r.nextInt(100) % 45 + 1;
//		int val4 = r.nextInt(100) % 45 + 1;
//		int val5 = r.nextInt(100) % 45 + 1;
//		int val6 = r.nextInt(100) % 45 + 1;
		
		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(val3);
//		System.out.println(val4);
//		System.out.println(val5);
//		System.out.println(val6);
		*/
		/*
		//while �ݺ���
		int condition = 0;
		while(condition < 6 ) {
			int val2 = r.nextInt(100) % 45 + 1;
			System.out.println(val2);
			condition++;
		}
		
		//do~while ��
		//�ѹ��� ������ �����ϰ� ��� �ݺ��� �� �Ǵ���.
		do {
			int val3 = r.nextInt(100) % 45 + 1;
			System.out.println(val3);
			condition++;
		}while(condition < 6);
		*/
		
		
		//for��
		for(int a = 4, b = 1; a >= 1; a--, b++)
		{
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
	}
	
}
