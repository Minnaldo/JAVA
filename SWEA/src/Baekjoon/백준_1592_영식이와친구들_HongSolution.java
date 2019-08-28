package Baekjoon;

import java.util.Scanner;

public class 백준_1592_영식이와친구들_HongSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] cnt = new int[N];
		int idx = 0;	//현재 공들고 있는놈.
		cnt[idx]++;
		int total = 0;	//패스 횟수
		
		while( cnt[idx] != M)
		{
			if( cnt[idx] == M)
	                break;
			if( cnt[idx] % 2 != 1)
			{
				//오
				idx = idx + L;
				if( idx >= N)
					idx -= N;
			}
			else
			{
				//왼
				idx = idx - L;
				if (idx < 0)
					idx += N;
			}
			cnt[idx]++;
			total++;
		}
		System.out.println(total);
	}

}
