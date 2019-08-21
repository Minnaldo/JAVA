import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(str);
		String input = sc.next();
		System.out.println(input.length());
		//7개씩 끊어서 출력해보시오
		int start = 0;
		int end = 7;
		while(end <= input.length()) {
//			System.out.println(input.substring(start,end));
			String binary = input.substring(start,end);
			//1111000 → 8 + 16 + 32 + 64
			int num = 0;
			for(int i = 0; i < 7; i++) {
				 // 1 , 2 , 4 ,8 , 16 , 32, 64
				num += (binary.charAt(7-1-i) - '0') * (1<<i);
			}
			System.out.println(num);
			//2진수를 10진수로 계산해 출력.
			start += 7;
			end += 7;
		}
	}
	static String str = "0000000111100000011000000111100110000110000111100111100111111001100111\n";
}







