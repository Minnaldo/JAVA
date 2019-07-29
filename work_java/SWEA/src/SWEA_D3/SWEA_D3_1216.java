//SWEA_D3_1216. 회문2
package SWEA_D3;

import java.util.Scanner;


//감도 안 온다.
public class SWEA_D3_1216 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) 
		{
			int num = sc.nextInt();
			char[][] input = new char[100][100];
			for(int i = 0; i < input.length; i++)
			{
				for(int j = 0; j < input.length; j++)
				{
					input[i][j] = (sc.next().charAt(i));
				}
			}
		}
		
		
		
		
	}
}
