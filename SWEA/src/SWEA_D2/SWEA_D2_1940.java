//SWEA_D2_1940. 가랏! RC카!
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1940 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int result = 0;
			int accel = 0;
			for(int i = 0; i < N; i++)
			{
				int num1 = sc.nextInt();
				int num2;
				
				//num1 == 1 이면,, num2를 accel에 더해라
				if(num1 == 1)
				{
					num2 = sc.nextInt();
					accel += num2;
					result += accel;
				}
				//num1 == 2 이면,, num2를 accel에 빼.
				else if(num1 == 2)
				{
					num2 = sc.nextInt();
					accel -= num2;
					if(accel < 0)
						accel = 0;
					result += accel;
				}
				//num1 == 0이면,, accel 그대로 거리에 더한다.
				else if(num1 == 0)
				{					
					result += accel;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}

}
