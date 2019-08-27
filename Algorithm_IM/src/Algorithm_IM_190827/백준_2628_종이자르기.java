package Algorithm_IM_190827;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 백준_2628_종이자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int input_num = sc.nextInt();	//구분선의 개수
		
		//List를 두 개 준비한다. 가로를 위한 그리고 세로를 위한.
		List<Integer> garo = new ArrayList<>();
		List<Integer> sero = new ArrayList<>();
		//각 리스트에 종이의 시작점을 의미하는 0을 넣어준다.
		garo.add(0);
		sero.add(0);
		for(int i = 0; i < input_num; i++)
		{
			int type = sc.nextInt();	//가로 : 0 or 세로 : 1
			int line = sc.nextInt();	//줄 번호
			//해당 줄 번호가 가로면 가로리스트에 세로면 세로리스트에 넣어준다.
			if(type == 0)
				garo.add(line);
			else
				sero.add(line);
		}
		//각 리스트에 종이의 종료점을 의미하는 세로선의 마지막 W와 가로선의 마지막 H를 각각 넣어준다.
		garo.add(H);
		sero.add(W);
		
		//두 리스트를 정렬한다. 오름차순.
		Collections.sort(garo);
		Collections.sort(sero);
		
//		System.out.println(garo.toString());
//		System.out.println(sero.toString());
		//앞뒤 갭의 최대값을 각각 구한다.
		int garo_max = 0;
		for(int i = 1; i < garo.size(); i++)
		{
			garo_max = Math.max(garo.get(i) - garo.get(i-1), garo_max);
		}
		
		int sero_max = 0;
		for(int i = 1; i < sero.size(); i++)
		{
			sero_max = Math.max(sero.get(i) - sero.get(i-1), sero_max);
		}
		//두 놈을 곱한다. 끝!!!
		System.out.println(garo_max * sero_max);
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