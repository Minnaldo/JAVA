package SWEA_D2;

import java.util.Scanner;

public class 백준_소수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		int T = sc.nextInt();
		for (int tc = 1; tc <= 1; tc++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			boolean[] era = new boolean[num2 + 1];

			for(int i = 0; i <= num2; i++)
				era[i] = true;

			for(int i = 2; i * i <= num2; i++)	{
				for(int j = 2; i * j <= num2; j++)	{
					era[i * j] = false;
				}
			}

			era[1] = false;

			for(int i = num1; i < era.length; i++)
			{
				if(era[i])
					System.out.println(i);
			}
		}
	}
}
