package TEST;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_프로그래머스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] answer = { "sun", "bed", "car" };
		
		System.out.println(Arrays.toString(answer));
		String temp;
//		for(int i = 0; i < answer.length - 1; i++) {
//			if(answer[i].charAt(1) > answer[i+1].charAt(1)) 
//			{
//				temp = answer[i];
//				answer[i] = answer[i+1];
//				answer[i+1] = temp;
//			}
//				
//		}
		/*for(int i = 0; i < answer.length; i++) {
			Arrays.sort(answer[i].charAt(1));
		}*/
		System.out.println(answer[1].charAt(1));
		System.out.println(answer[0]);
		System.out.println(Arrays.toString(answer));
	}

	
	public String[] solution(String[] strings, int n) {
		String[] answer = { "sun", "bed", "car" };
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}
