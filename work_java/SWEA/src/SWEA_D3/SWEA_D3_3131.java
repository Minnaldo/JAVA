//SWEA_D3_3131. 100만 이하의 모든 소수
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_3131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		int T = sc.nextInt();
		for (int tc = 1; tc <= 1; tc++) {

			boolean[] era = new boolean[1000000 + 1];

			for(int i = 0; i <= 1000000; i++)
				era[i] = true;

			for(int i = 2; i * i <= 1000000; i++)	{
				for(int j = 2; i * j <= 1000000; j++)	{
					era[i * j] = false;
				}
			}

			era[1] = false;

			for(int i = 1; i < era.length; i++)
			{
				if(era[i])
					System.out.print(i + " ");
			}
		}
	}
}
