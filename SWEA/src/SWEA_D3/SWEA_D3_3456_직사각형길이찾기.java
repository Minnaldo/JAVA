//SWEA_D3_3456_직사각형길이찾기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_3456_직사각형길이찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++)
		{
			// 1 1 2 / 4 3 4 / 5 5 5
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = 0;
			
			if(a == b)
				d = c;
			else if(a == c)
				d = b;
			else if(b == c)
				d = a;
			
			System.out.println("#" + tc + " " + d);
		}

	}

}
