package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1989_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			int result = 1;
			
			char[] c_arr = input.toCharArray();
			int j = c_arr.length - 1;
			for(int i = 0; i < c_arr.length; i++)
			{
				if(c_arr[j] != c_arr[i])
				{
					result = 0;
					break;
				}
				j--;
			}
			
			
			System.out.println("#" + tc + " " + result);
		}
	}

}
