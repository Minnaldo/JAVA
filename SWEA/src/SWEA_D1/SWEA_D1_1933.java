//SWEA_1933_ 간단한 N 의 약수
package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_1933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++)
		{
			if(input % i == 0)
			{
				System.out.print(i + " ");
			}
		}
	}

}
