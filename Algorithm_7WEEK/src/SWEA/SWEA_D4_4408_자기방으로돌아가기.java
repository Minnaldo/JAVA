//SWEA_D4_4408_자기방으로돌아가기
package SWEA;

import java.util.Scanner;

public class SWEA_D4_4408_자기방으로돌아가기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int[] num1 = new int[N];
			int[] num2 = new int[N];
			
			for(int i = 0; i < N; i++)
			{
				num1[i] = sc.nextInt();
				num2[i] = sc.nextInt();
			}
			
			int cnt = 1;
			for(int i = 1; i < N; i++)
			{
				for(int j = i; j < N; j++)
				{
					//num1[1] 이 num2[0] 보다 작으면 카운트 증가
//					if(num1[i] < num2[i-1])
//						cnt++;
					
					if(num2[i-1] > num1[j])
					{
						if(num1[i] < num2[j-1])
							cnt++;
					}
//					if(num2[i-1] > num1[j])
//						cnt++;
				}
				
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}

}
