import java.util.Scanner;

public class 몫과나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int q = a / b;//몫
			int r = a % b;//나머지
			System.out.println("#" + tc + " " + q + " " + r);
		}
	}
	
}
