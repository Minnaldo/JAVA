package 순열;

import java.util.Arrays;
import java.util.Scanner;

public class MIN_회의실배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int tc = 0; tc < 1; tc++)
		{
			int N = sc.nextInt();
			int[] start_time = new int[N];
			int[] end_time = new int[N];
			for(int i = 0; i < N; i++)
			{
				start_time[i] = sc.nextInt();
				end_time[i] = sc.nextInt();
			}

			//			Arrays.sort(end_time);
			int min = 100001;
			int k = 0;
			for(int i = 0; i < N; i++)
			{
				if(min > end_time[i])
				{
					min = end_time[i];
					k = i;
				}
			}

			int l = 0;
			int start_time_min = 100001;
			for(int i = k; i < N; i++)
			{
				if(start_time[i] >= end_time[k])
				{
					start_time_min = start_time[i];
					l = i;
				}
			}
			
			
			
			
			
//			int cnt = 0;
//			int start_time_min = 100001;
//			for(int i = 0; i < N; i++)
//			{
//				for(int j = i; j < N; j++)
//				{
//					if(start_time[i] >= end_time[i])
//					{
//						if(start_time_min > start_time[i])
//							start_time_min = start_time[i];
//					}
//				}
//			}



		}

	}

}
