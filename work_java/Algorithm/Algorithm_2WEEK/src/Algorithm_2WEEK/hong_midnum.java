package Algorithm_2WEEK;

import java.util.Scanner;

public class hong_midnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] count = new int[200];
		
		for(int i = 0; i < N; i++)
		{
			count[sc.nextInt()]++;
		}

		int sum = 0;
		int i = 0;
		while(true)
		{
			sum += count[i];
			if( sum > N/2)
				break;
			i++;
		}
		System.out.println(i);
	}

}