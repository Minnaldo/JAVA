package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*next() 메소드는 띄어쓰기 기준으로 읽기 때문에
		 * 띄어쓰기가 반영되어 출력 결과가 다르게 나올 수 있다.
		 * nextLine() 메소드는 한 라인을 읽기 떄문에
		 * 같은 라인에 있는 값을 그대로 가져올 수 있다.
		 */
		
		//String형의 input 변수 nextLine으로 받아줌.
		String input = sc.nextLine();
		
		//String으로 입력값을 한번에 받아준 후,
		//char형 arr배열을 선언한다.
		
		/*toCharArray() 메소드는
		 * =>char배열로 반환하는 String 클래스의 메소드 배열
		 * charAt() 메소드는
		 * 인자의 위치에 있는 char값을 반환하는 String 클래스의 메소드
		 */
		
		//toCharArray() : 문자열을 문자배열로 변환!
		char[] arr;
		arr = input.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] >= 97 && arr[i] <= 122)
			{
				arr[i] = (char)(arr[i]-32);
			}
		}
		
		System.out.print(arr);
	}

}
