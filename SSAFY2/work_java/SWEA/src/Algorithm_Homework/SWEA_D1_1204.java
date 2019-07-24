package Algorithm_Homework;

import java.util.Scanner;

public class SWEA_D1_1204 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        //최빈수 : 가장 많이 있는 값.
        //최빈수가 여러 개 일떄는, 큰 점수 출력!
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        //테스트 케이스 input 만큼	        
        for(int tc = 1; tc <= input; tc++)
        {
            int result = 0;					//최빈수 중 최고 점수
            int max = 0;					//최빈값
            
            int[] arr = new int[101];		// 0~100점까지 101개 담을 arr 배열.
        	
        	//테스트케이스 num
            int tc_num = sc.nextInt();
            
            //학생수가 1000명이라 for문을 1000번
            for (int j = 0; j < 1000; j++)
            {
                int chk = sc.nextInt();		//chk에 학생들의 점수값(input)을 넣고
                arr[chk]++;					//arr배열에 바로 카운트 증가
            }
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = 0;   
            
            for (int j = 0; j < arr.length; j++)
            {
            	if (arr[j] == arr[max])		//최빈값이 같으면
            	{
	            	if(temp <= j)			
	            	{
	            		temp = j;			//j값을 temp에 넣고
	            		result = temp;		//temp값을 result에 넣은다.
	            	}						//최종적으로 가장 큰 값이 담긴다.
            	}
            }
            System.out.println("#" + tc + " " + result);
        }
    }

}
