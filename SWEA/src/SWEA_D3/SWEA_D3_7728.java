//SWEA_D3_7728. 다양성 측정
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_7728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			String str = sc.next();

			char[] c = str.toCharArray();
			int[] num = new int[10];

			for(int i = 0; i < c.length; i++)
			{
				if(c[i] - '0' == 0)
					num[0] = 1;
				else if(c[i] - '0' == 1)
					num[1] = 1;
				else if(c[i] - '0' == 2)
					num[2] = 1;
				else if(c[i] - '0' == 3)
					num[3] = 1;
				else if(c[i] - '0' == 4)
					num[4] = 1;
				else if(c[i] - '0' == 5)
					num[5] = 1;
				else if(c[i] - '0' == 6)
					num[6] = 1;
				else if(c[i] - '0' == 7)
					num[7] = 1;
				else if(c[i] - '0' == 8)
					num[8] = 1;
				else if(c[i] - '0' == 9)
					num[9] = 1;
			}

			int sum = 0;
			for(int i = 0; i < 10; i++)
			{
				sum += num[i];
			}
			
			System.out.println("#" + tc + " " + sum);
		}

	}

}
