//SWEA_D3_1208. Flatten
package SWEA_D3;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D3_1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 10개가 주어짐.
		for(int tc = 1; tc <= 10; tc++)
		{
			int dump_num = sc.nextInt();
			int[] array = new int[100];
			int result = 0;
			
			//가로 100 크기라,  인덱스 100개의 배열 생성
			//배열에 높이값을 넣어줌.
			for(int j = 0; j < 100; j++)
			{
				array[j] = sc.nextInt();
			}
			
			//덤프횟수만큼 반복문을 실행
			//배열을 정렬하여 작은 수부터 큰 수까지 정렬함.
			//가장 큰 값이 들어있는 마지막 배열에서 하나를 빼주고
			//가장 작은 값이 들어있는 첫 번째 배열에 하나를 넣어준다.
			//반복문을 종료하고 정렬을 다시한다.
			for(int i = 0; i < dump_num; i++)
			{
				Arrays.sort(array);
				array[99]--;
				array[0]++;
			}
			Arrays.sort(array);
			
			result = array[99] - array[0];
			
			System.out.println("#" + tc + " " + result);
			
		}
	}
}