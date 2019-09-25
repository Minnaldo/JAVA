package TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 영역자르기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int input_num = sc.nextInt();
		
		ArrayList<Integer> garo = new ArrayList<>();
		ArrayList<Integer> sero = new ArrayList<>();
		
		garo.add(0);
		sero.add(0);
		
		for(int i = 0; i < input_num; i++) {
			int type = sc.nextInt();
			int line = sc.nextInt();
			
			if(type == 0)
				garo.add(line);
			if(type == 1)
				sero.add(line);
		}
		
		garo.add(M);
		sero.add(N);
		
		Collections.sort(garo);
		Collections.sort(sero);
		
		int garo_max = 0;
		for(int i = 1; i < garo.size(); i++) {
			garo_max = Math.max(garo.get(i) - garo.get(i-1), garo_max);
		}
		
		int sero_max = 0;
		for(int i = 1; i < sero.size(); i++) {
			sero_max = Math.max(sero.get(i) - sero.get(i-1), sero_max);
		}
		
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