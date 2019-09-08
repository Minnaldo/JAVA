package Baekjoon;

import java.util.Scanner;

public class 백준_막대기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner	sc = new Scanner(System.in);
		int Num = 64;
		int X = sc.nextInt();
			
		//지민이가 가지고 있는 막대의 길이를 모두 더한다. 
		//처음에는 64cm 막대 하나만 가지고 있다. 
		//이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.

		  //가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
		int cnt = 0;
		while (true)
		{
			if(X <= 0)
				break;
			
			if( Num > X )
			{
				Num /= 2;
			}
			
			else
			{
				cnt++;
				X -= Num;
			}
		}
				
		  //만약, 위에서 자른 막대의 절반 중 하나를 버리고 
		  //남아있는 막대의 길이의 합이 X보다 크거나 같다면, 
		  //위에서 자른 막대의 절반 중 하나를 버린다.
		
		//이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
		
		System.out.println(cnt);
		
	}

}
