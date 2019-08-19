//2577. 백준_숫자의개수
package SWEA_D2;

import java.util.Scanner;

public class 백준_숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int mul = num1*num2*num3;
				
		String str = Integer.toString(mul);
		
		char[] c = str.toCharArray();
		
		int[] cnt = new int[10];
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == '0')
				cnt[0]++;
			else if(c[i] == '1')
				cnt[1]++;
			else if(c[i] == '2')
				cnt[2]++;
			else if(c[i] == '3')
				cnt[3]++;
			else if(c[i] == '4')
				cnt[4]++;
			else if(c[i] == '5')
				cnt[5]++;
			else if(c[i] == '6')
				cnt[6]++;
			else if(c[i] == '7')
				cnt[7]++;
			else if(c[i] == '8')
				cnt[8]++;
			else if(c[i] == '9')
				cnt[9]++;
		}

		for(int i = 0; i < 10; i++)
			System.out.println(cnt[i]);
	}
}
