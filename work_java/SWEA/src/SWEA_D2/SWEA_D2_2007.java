//SWEA_D2_2007. 패턴 마디의 길이
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) 
        {
            String text = sc.next();
            int checkL = -1;
            for(int i = 1; i < 10; i++) 
            {
                String str  = text.substring(0,i);
                String next = text.substring(i,i+i);
                if(str.equals(next)) 
                {
                    checkL = i;
                    break;
                }
            }
            System.out.println("#"+tc + " "+ checkL);
        }
    }
}
