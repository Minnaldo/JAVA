package Programmers;

import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		solution(3, 12);
	}

	public static int[] solution(int n, int m) {
		int[] answer = {};

		int[] result1 = new int[n], result2 = new int[m];
		int cnt1 = 0, cnt2 = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				result1[cnt1++] = i;
			}
		}

		for(int i = 1; i <= m; i++) {
			if(m % i == 0) {
				result2[cnt2++] = i;
			}
		}

		int choidae = 0;
		for(int i = 0; i < result1.length; i++) {
			for(int j = 0; j < result2.length; j++) {
				if(result1[i] != 0)
				{
					if(result1[i] == result2[j]) {
						choidae = j;
					}
				}
			}
		}

		System.out.println(choidae);
		//	      System.out.println(Arrays.toString(result1));
		//	      System.out.println(Arrays.toString(result2));

		return answer;
	}
}
