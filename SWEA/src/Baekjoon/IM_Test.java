package Baekjoon;
import java.util.Scanner;

public class IM_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			int start_x = 0;
			int start_y = 0;
			int end_x = 0;
			int end_y = 0;
			int paint_num = 0;
			int[][] arr = new int[N][M];


			int max = 0, k = 0;
			int[] cnt = new int[11];
			for(int p = 0; p < K; p++)
			{
				start_x = sc.nextInt();
				start_y = sc.nextInt();
				end_x = sc.nextInt();
				end_y = sc.nextInt();
				paint_num = sc.nextInt();

				boolean check = true;
				int j =0;
				for(int i = start_x; i <= end_x; i++)
				{
					for(j = start_y; j <= end_y; j++)
					{
						if(arr[i][j] > paint_num)
						{
							check = false;
						}

					}
				}


				if(check)
				{
					for(int i = start_x; i <= end_x; i++)
					{
						for(j = start_y; j <= end_y; j++)
						{
							//arr[i][j]가 paint_num 보다 작거나 같으면 칠한다.

							arr[i][j] = paint_num;

						}
					}
				}
			}
			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < M; j++)
				{
					if(arr[i][j] == 0)
					{
						cnt[0]++;
					}
					else if(arr[i][j] == 1)
					{
						cnt[1]++;
					}						
					else if(arr[i][j] == 2)
					{
						cnt[2]++;
					}
					else if(arr[i][j] == 3)
					{
						cnt[3]++;
					}
					else if(arr[i][j] == 4)
					{
						cnt[4]++;
					}
					else if(arr[i][j] == 5)
					{
						cnt[5]++;
					}
					else if(arr[i][j] == 6)
					{
						cnt[6]++;
					}
					else if(arr[i][j] == 7)
					{
						cnt[7]++;
					}
					else if(arr[i][j] == 8)
					{
						cnt[8]++;
					}
					else if(arr[i][j] == 9)
					{
						cnt[9]++;
					}
					else if(arr[i][j] == 10)
					{
						cnt[10]++;
					}
					else if(arr[i][j] == 11)
					{
						cnt[11]++;
					}


				}
			}

			for(int i = 0; i < 11; i++)
			{
				if(cnt[i] > max)
					max = cnt[i];
			}


			System.out.println("#" + tc + " " + max);

		}
	}
}

/*
5      
5 5 1
1 0 4 3 3
5 5 4
0 2 2 3 5
1 2 2 3 5
1 0 4 2 5
2 3 4 4 3
7 7 3
5 1 6 5 0
5 4 5 5 0
2 0 5 6 2
 */