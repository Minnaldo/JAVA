//SWEA_D3_7501_상원이의연속합
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_7510_상원이의연속합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int sum = 0, cnt = 0;
			for(int i = 1; i <= num; i++)
			{
				for(int j = i; j <= num; j++)
				{
					sum += j;
					
					if(sum == num)
					{
						cnt++;
						break;
					}
					
					if(sum > num)
					{
						sum = 0;
						break;
					}
					
				}
			}

			System.out.println("#" + tc + " " + cnt);
		}
	}

}





//if(sum > num)
//{
//	sum = 0;
//	break;
//}
//
//else if(sum < num)
//{
//	sum += j;
//}
//
//if(sum == num)
//{
//	cnt++;
//	sum = 0;
////	continue;
//}
