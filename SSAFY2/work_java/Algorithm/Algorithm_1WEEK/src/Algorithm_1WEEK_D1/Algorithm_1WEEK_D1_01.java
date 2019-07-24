package Algorithm_1WEEK_D1;

import java.util.Scanner;

public class Algorithm_1WEEK_D1_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
				
		//[입력] 메모리의 길이 1이상 50이하,,
		//  => 정수가 아니라 문자열로 다뤄야 할 문제.
		for (int tc = 1; tc <= test_case; tc++)
		{
			//문자열 입력 받는것
			//sc.next() : 공백까지 입력 받는다.
			//sc.nextLine() : 한 줄을 통째로 받는다.
			//				nextLine은 nextLine만 써야한다.
			
			//위 문제는 공백이 있지 않으니까 next로 입력 받으면 됨.
			String input = sc.next();
			int cnt = 0;	//몇 번 바꿨는지 카운트로 체크.
			char[] mem = new char[input.length()];	//입력 받은게 몇 칸인지.
			
			//mem 배열 초기화.
			for(int i = 0; i < mem.length; i++)
				mem[i] = '0';
			
			//입력된 문자열(기억에 있는 원본 메모리 비트열)을 처음부터 끝까지 검사해가며
			for (int i = 0; i < input.length(); i++)
			{
				//검사하는 위치의 비트가 내가 복원중인(초기화된)메모리와 비트가 다르다면
				if (input.charAt(i) != mem[i])
				{
					//복원중인 메모리의 해당 비트를 기억에 있는 비트로 바꿈
					//(현재부터 끝까지 다 변경되는 규칙에 따라서....)
					for (int j = i; j < mem.length; j++)
					{
						mem[j] = input.charAt(i);
					}
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
			
			/* 앞에서부터 한 글자씩 검사하면서 같으면 지나가
			 * 다르면 현재위치부터 끝까지를 그 비트로 변경하고 카운트 1 추가.
			 */
			
			/* 010001 이면
			 * 왼쪽부터 차례대로 0111111 => 0100000 => 0100001
			 * 이런식으로 
			 */
			
			
		}
	}
}











//public class Algorithm_1WEEK_D1_01 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int test_case = sc.nextInt();
//				
//		for (int i = 1; i <= test_case; i++)
//		{
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			
//			int div = div = num1 / num2;
//			int mod = mod = num1 % num2;
//			
//			System.out.println("#" + i + " " + div + " " + mod);
//		}
//	}
//}