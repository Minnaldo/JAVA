package SWEA;

import java.util.Scanner;

public class SWEA_D4_4408_자기방으로돌아가기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int[] num1 = new int[N+1];
			int[] num2 = new int[N+1];
			int[] bok = new int[202];


			for(int i = 1; i <=N; i++)
			{
				num1[i] = sc.nextInt();
				num2[i] = sc.nextInt();

				num1[i] = (num1[i]+1)/2;
				num2[i] = (num2[i]+1)/2;
				
				if(num1[i] < num2[i])
				{
					for(int j = num1[i]; j <= num2[i]; j++)
					{
						bok[j]++;
					}
				}
				else
					for(int j = num2[i]; j <= num1[i]; j++)
					{
						bok[j]++;
					}
			}

			int cnt = 1;
			int max = 0;
			for(int i = 1; i <= 200; i++)
			{
				if(max < bok[i])
					max = bok[i];
			}

			System.out.println("#" + tc + " " + max);
		}
	}

}
