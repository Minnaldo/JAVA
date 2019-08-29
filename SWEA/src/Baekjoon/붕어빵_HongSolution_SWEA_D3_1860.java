package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 붕어빵_HongSolution_SWEA_D3_1860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();	//고객 수
			int M = sc.nextInt();	//붕어빵 생산주기
			int K = sc.nextInt();	//붕어빵 한 판에 만들어지는 갯수

			int[] customers = new int[N];
			for(int i = 0; i < N; i++)
				customers[i] = sc.nextInt();

			//손님의 도착시간은 순서가 우후죽순
			Arrays.sort(customers);
			String msg = "Possible";
			int idx = 0;
			int fish = 0; //현재 붕어빵의 개수
			//가장 늦게온 친구가 올 때까지 시간을 탐색
			for(int i = 0; i <= customers[N-1]; i++)
			{
				if( i > 0 && i % M == 0)
					fish += K;

				
				//현재 시간이 현재 검사하는 고객님의 도착시간과 같다면,
				//붕어 하나 소비. 다음 고객을 검사. 이것을 반복.
				while( idx < N && i == customers[idx] )
				{
					//붕어빵 하나 주고,
					fish--;
					//다음 고객검사
					idx++;
					//하고 나서도 다음고객과 같은 시간일 수 있으니. 반복적으로 현재 시간이 고객도착시간인지를 검사
					//붕어가 음수로 빠지면, 못준거임.
					if(fish < 0)
					{
						msg = "Impossible";
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + msg);
		}
	}

}
