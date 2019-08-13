package SWEA_D2;

import java.util.Scanner;

public class 소수찾기 {

	/*100이하의 숫자 중에서 소수를 모두 찾아 출력,,
	 * 소수의 규칙은 1과 자기자신 외의 어떤 수로도 나누어 떨어지지 않는 수.
	 * 
	 * 18이 소수인지 아닌지 검사.
	 * 18은 2로 나누어떨어짐.. 소수아님..
	 * 
	 * 21이 소수인지 아닌지 검사..
	 * 21은 2로 나누어떨어지지 않음.. 통과
	 * 21은 3으로 나누어떨어짐.. 소수아님..
	 * 
	 * 35가 소수인지 아닌지 검사
	 * 35는 2로 나누어 떨어지지 않음.. 통과
	 * 35는 3으로 나누어떨어지지 않음.. 통과
	 * 35는 5로 나누어떨어짐..  소수아님..
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
//			int num = sc.nextInt();
//			boolean flag = true;

//			//2부터 num까지 반복한다.
//			for(int i = 2; i <= num; i++)
//			{
//				//각 반복에서 2부터 자기자신까지 반복한다.
//				for(int j = 2; j < i; j++)
//				{
//					//반복안에서 위 숫자가 자기자신을 나누어떨어뜨리는지 검사..
//					//해서 나누어떨어뜨리면 소수가 아닌걸로 판정.
//					if(i % j == 0)
//					{
//						flag = false;
//						break;
//					}
//				}
//				
//				// i는 소수였을까?
//				if(flag)
//					System.out.println(i);
//				
//			}
//			if(flag)
//			{
//				System.out.println("소수가 맞습니다.");
//			}
//			else
//			{
//				System.out.println("소수가 아닙니다.");
//			}
			
			
			/*2. 에라토스테네스의 체 로직으로 소수들을 구해봅시다.
			 * 100까지 크기의 boolean 배열을 준비한다.
			 * 4 6 8 10 12 ... 번째 인덱스에 false를 칠하자.
			 * 9 12 15 18 21 ... 번째 인덱스에 false를 칠하자.
			 * 8 12 16 18 20 24 ... 번째 인덱스에 false를 칠하자.
			 * 10 15 20 25 30 35 ... 번째 인덱스에 false를 칠하자.
			 * (int)Math.sqrt(i) ... 번째 인덱스에도 false...
			 */
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			boolean[] era = new boolean[num2 + 1];
			
			for(int i = 0; i < num2; i++)
				era[i] = true;
			
			//2의 2,3,4,5배수... n배수까지 <=100까지 지운다.
			//3의 2,3,4,5배수... n배수까지 <=100까지 지운다.
			//...
			//...
			//10까지...
			
			//나누어지는건 소수가 아니니
			//곱해지는거 또한 소수가 아니다.
			//ex) 56 -> 8 x 7   : 56은 8과 7로 나누어진다.
			for(int i = 2; i * i <= num2; i++)
			{
				for(int j = 2; i * j <= num2; j++)
				{
					era[i * j] = false;
				}
				
			}
			
			for(int i = num1; i < era.length; i++)
			{
				if(era[i])
//					System.out.println(i + "는 소수입니다.");
					System.out.println(i);
			}
			
			

		}

	}

}
