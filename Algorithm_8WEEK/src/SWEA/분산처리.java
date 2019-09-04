//분산처리
package SWEA;

import java.util.Scanner;

public class 분산처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a^b);
		}
	}

}
