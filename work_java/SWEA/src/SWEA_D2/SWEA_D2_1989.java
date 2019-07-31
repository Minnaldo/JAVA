package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++)
		{
			String str = sc.next();
			int result = 1;
			
			char[] ch_arr = str.toCharArray();
			int j = ch_arr.length - 1;
			for(int i = 0; i < ch_arr.length; i++)
			{
				if(ch_arr[j] != ch_arr[i])
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
