package Algorithm_1WEEK_D1;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_1WEEK_D1_1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int[] Jumsu;
		int[] Kal;
		int[] Chk;
		int Jumsu_Sum = 0;
		int Kal_Sum = 0;				
		
		for (int i = 0; i < test_case; i++)
		{
			int N = sc.nextInt();	//재료의 수
			int L = sc.nextInt();	//제한 칼로리
			
			Jumsu = new int[N];
			Kal = new int[N];
			
			
			//맛점수(Jumsu)와 칼로리(Kal) 값을 배열에 담는다.
			for (int j = 0; j < N; j++)
			{
				Jumsu[j] = sc.nextInt();
				Kal[j] = sc.nextInt();						

			}
			Arrays.sort(Kal);
			for (int k = 0; k < N; k++)
			{
				Kal_Sum += Kal[k];
				for (int l = k+1; l < N; l++)
				{
					if (Kal_Sum <= 1000)
					{
						Kal_Sum += Kal[l];
					}
				}
			}
			for (int k= 0; k < N; k++)
			{
				System.out.println(Kal[k]);
			}
		}
	}

}
