package SWEA_D1;

import java.util.Scanner;

public class SWEA_D1_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
		//input이 0일때까지 반복
		while (input != 0)
		{
			//input을 10으로 나눈 나머지 값을 sum에 더해줌.
			//ex) 6789를 10으로 나누면  몫:678 , 나머지:9
			//따라서 9를 sum에 더해준다.
			//이후 input을 10으로 나눈 몫을 input에 다시 넣은 후, 반복
			sum += (input % 10);
			input = input / 10;
		}
		
		System.out.println(sum);
	}
}
