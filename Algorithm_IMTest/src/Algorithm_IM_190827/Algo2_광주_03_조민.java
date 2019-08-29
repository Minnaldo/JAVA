package Algorithm_IM_190827;
import java.util.Arrays;
import java.util.Scanner;

public class Algo2_광주_03_조민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int input_num = sc.nextInt();	//구분선의 개수
		
		//List를 두 개 준비한다. 가로를 위한 그리고 세로를 위한.
		//각 리스트에 종이의 시작점을 의미하는 0을 넣어준다.
		
		
		int[] garo = new int[input_num];
		int[] sero = new int[input_num];

		int[] value = new int[M+1];
		for(int i = 0; i < input_num; i++)
		{
			int num1 = sc.nextInt();

			if(num1 == 0)
				garo[i] = sc.nextInt();
			if(num1 == 1)
				sero[i] = sc.nextInt();
		}


		Arrays.sort(garo);
		value[0] = garo[0] * N;
		for(int i = 1; i < garo.length + 1; i++)
		{
			value[i] =  (garo[i] * N) - value[i-1];
			value[i+1] = (M-garo[i] * N);
		}

		int max = 0;


		//		value[0] = sero[0] * M;
		//		for(int i = 1; i <= garo.length + 1; i++)
		//		{
		//			value[8] =  (garo[i] * N) - value[i-1];
		//		}
	}

}

/*
10 8
3
0 3
1 4
0 2
 */




/* 1차 목표
 * 시작선, 구분선, 구분선, 구분선, ... 종료선
 * 의 선 번호를 배열에 때려박자.
 * 
 * 2차 작업
 * 가장 긴 
 */