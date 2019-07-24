//중간값찾기 (카운팅 정렬 해보기)
package Algorithm_2WEEK;

import java.util.Arrays;
import java.util.Scanner;

public class midnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] chk = new int[N + 1];
		int[] input = new int[N];
		int[] sort_input = new int[N];
		int sum = 0, max = -1;
		int result = 0;
		
		//입력값.
		for(int i = 0; i < N; i++)
		{
			input[i] = sc.nextInt();
			if(max < input[i])
				max = input[i];
		}
		
		//원소 개수 계산.
		for(int i = 0; i < input.length; i++)
		{
			chk[input[i]]++;
		}
		
		for (int i = 1; i < chk.length; i++)
		{
			chk[i] += chk[i-1];
		}
		
		for(int i = input.length -1; i >= 0; i--)
		{
			sort_input[--chk[input[i]]] = input[i];
		}
		
		System.out.println(Arrays.toString(sort_input));
		
		
		for(int i = 0; i < chk.length; i++)
		{
			sum += chk[i];
			if( sum > N / 2)
			{
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
