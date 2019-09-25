package TEST;

import java.util.Scanner;

public class programmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean answer = true;
		String s = sc.next();
				
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) > 64) {
				answer = false;
				break;
			}
			else if(s.charAt(i) < 64)
				answer = true;
			
		}
		
		
		System.out.println(answer);
	}

}
