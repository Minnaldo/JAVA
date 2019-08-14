//SWEA_D2_1859_Hong_Solution. 백만 장자 프로젝트
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1859_Hong_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();	//(2 <= N <= 1,000,000)
			int[] arr = new int[N];
			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			
			/*맨 뒤에서부터 검사해오면서, 최대값을 갱신.
			 * 최대값이 갱신될떄는 갱신만하면 되고
			 * 아닌 경우는 최대값-자기자신의가격 만큼을 결과에 누적합.
			 */
			
			long result = 0;
			int max = arr[N-1];
			for(int i = N-1; i>= 0; i--)
			{
				if( arr[i] > max )
					max = arr[i];
				else
					result += (max - arr[i]);
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
