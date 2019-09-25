package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class programmers_모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	}

	public int[] solution(int[] answers) {
		int[] answer = { };

		int[] supo1 = {1, 2, 3, 4, 5};					//5
		int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};			//8
		int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};	//10

		
		int cnt1=0, cnt2=0, cnt3=0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == supo1[i%5]) {
				cnt1++;
			}
			if(answer[i] == supo1[i%8]) {
				cnt2++;
			}
			if(answer[i] == supo1[i%10]) {
				cnt3++;
			}
		}
		
		int max_cnt=0;
		max_cnt = Math.max(cnt1, Math.max(cnt2, cnt3));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		if(max_cnt == cnt1)
			list.add(1);
		if(max_cnt == cnt2)
			list.add(2);
		if(max_cnt == cnt3)
			list.add(3);
		
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = (int) list.get(i);
		}

		return answer;
	}

}
