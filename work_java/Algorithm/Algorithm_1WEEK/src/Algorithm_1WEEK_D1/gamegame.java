package Algorithm_1WEEK_D1;

import java.util.Scanner;

public class gamegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();					
		boolean b1, b2;
        
        for(int i=1; i<input; i++) {
            if (i<10) {  // 입력값이 한자리 수인 경우
                if ((i %3) == 0)
                    System.out.println(i + " -");
            }
            else {  // 입력값이 두자리 수인 경우
                b1 = (i/10) %3 == 0;  // 십의 자리수가 3의 배수인지 판별
                b2 = (i%10) %3 == 0;  // 일의 자리수가 3의 배수인지 판별
                  
                if ((i%10) == 0) // 예외처리. ex)30, 60, 90
                    b2 = false;
                  
                if (b1 && b2)
                    System.out.println(i + " --");
                else if (b1 || b2)
                    System.out.println(i + " -");
            }
        }
	}

}
