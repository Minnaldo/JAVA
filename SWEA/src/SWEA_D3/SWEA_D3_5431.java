//SWEA_D3_5431. 민석이 과제 체크하기
package SWEA_D3;

import java.util.Scanner;

public class SWEA_D3_5431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();			//테스트케이스 개수
		
		for(int i = 0; i < T; i++)
		{
			int N = sc.nextInt();		//수강생의 수
			int K = sc.nextInt();		//과제제출자의 수
			
			int[] arr = new int[N + 1];
			
			//과제제출자를 HW_OK 변수에 담고
			//과제제출자 번호에 맞게끔 arr배열인덱스에 넣어 카운트 증가.
			for(int j = 0; j < K; j++)		//과제제출자 수만큼 반복문.
			{
				int HW_OK = sc.nextInt();
				arr[HW_OK]++;
			}
			
			System.out.print("#" + (i+1) + " ");
			for(int j = 1; j <= N; j++)
			{
				if(arr[j] == 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
