package Algorithm_1WEEK_D1;

import java.util.Scanner;

public class Algorithm_1WEEK_D2_1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++)
		{	
			//문자열 변환
			String strCnt = String.valueOf(i);
			//3, 6, 9 해당여부 저장
			boolean isGame = false;	
			
			for (int j = 0; j < strCnt.length(); j++)
			{		
				char chk = strCnt.charAt(j);
				
				//해당 수의 앞에서부터 i번째 숫자부터 검사
				if(chk == '3' || chk == '6' || chk == '9')
				{
					//3 6 9 라면 "- " 출력;
					System.out.print("-");
					isGame = true;
				}
//				if(chk == '33' || chk == '36' || chk == "39" || chk == "63" || chk == "66" || chk == "69" || chk == "93" || chk == "96" || chk == "99")
//				{
//					
//				}
			}
						

			if (!isGame)
				// 3 6 9 해당되지 않았다면 카운트 표시
				System.out.print(strCnt + " ");
			
//			if (i % 10 == 0)
//			{
//				System.out.println();
//			}
//			else
//			{
//				System.out.print(" ");
//			}
		}
	}
}