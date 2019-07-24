package Algorithm_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D1_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();		//input
		int[] arr = new int[input];		//점수를 담을 배열
		
		//배열에 점수를 담는다.
		for (int tc = 0; tc < input; tc++)
		{
			arr[tc] = sc.nextInt();
			
		}
		
		//오름차순 배열 정렬.
		Arrays.sort(arr);
				
		//오름차순으로 배열 정렬 후,,
		//배열의 인덱스를 2로 나누어 중간값을 출력한다.
		//조건에서 홀수 개수만큼 입력하기 때문에 2로 나누기만 하면 됨.
		System.out.print(arr[input / 2]);	
	}

}
