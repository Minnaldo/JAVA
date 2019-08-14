//SWEA_D4_1233. 9일차 - 사칙연산 유효성 검사
package SWEA_D4;

import java.util.Scanner;

public class SWEA_D4_1233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int tc = 1; tc <= T; tc++) {
			//숫자 N이 입력된 후. N줄에 걸쳐서 데이터가 들어옴.
			int N = Integer.parseInt(sc.nextLine());
			
			//N이 짝수라면. 글렀다.
			if( N % 2 == 0) {
				for(int i = 1; i <= N; i++) {
					sc.nextLine();
				}
				System.out.println("#" + tc + " " + 0);
			}
			else {
				int result = 1;
				for(int i = 1; i <= N / 2; i++) {
					//연산자 아닌게 한번이라도 나오면 잘못된것
					String[] str = sc.nextLine().split(" "); //1 - 2 3
					char c = str[1].charAt(0);
					if(c == '+' || c == '-' || c == '*' || c == '/') {
						
					}
					else {
						result = 0;
					}
				}
				for(int i = N / 2 + 1; i <= N; i++) {
					//한번이라도 피연산자가 아닌게 나오면 잘못된것
					String[] str = sc.nextLine().split(" "); //1 - 2 3
					char c = str[1].charAt(0);
					if( c >= '0' && c <= '9' ) {
						
					}
					else {
						result = 0;
					}
				}
				System.out.println("#" + tc + " " + result);
			}
		}
	}
}
