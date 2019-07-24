package Algorithm_1WEEK_D1;

import java.util.Scanner;

public class SWEA_D1_1204 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�ֺ�� : ���� ���� �ִ� ��.
        //�ֺ���� ���� �� �ϋ���, ū ���� ���!
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        //�׽�Ʈ ���̽� input ��ŭ	        
        for(int tc = 1; tc <= input; tc++)
        {
            int result = 0;					//�ֺ�� �� �ְ� ����
            int max = 0;					//�ֺ�
            
            int[] arr = new int[101];		// 0~100������ 101�� ���� arr �迭.
        	
        	//�׽�Ʈ���̽� num
            int tc_num = sc.nextInt();
            
            //�л����� 1000���̶� for���� 1000��
            for (int j = 0; j < 1000; j++)
            {
                int chk = sc.nextInt();		//chk�� �л����� ������(input)�� �ְ�
                arr[chk]++;					//arr�迭�� �ٷ� ī��Ʈ ����
            }
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = 0;   
            
            for (int j = 0; j < arr.length; j++)
            {
            	if (arr[j] == arr[max])		//�ֺ��� ������
            	{
	            	if(temp <= j)			
	            	{
	            		temp = j;			//j���� temp�� �ְ�
	            		result = temp;		//temp���� result�� ������.
	            	}						//���������� ���� ū ���� ����.
            	}
            }
            System.out.println("#" + tc + " " + result);
        }
    }

}
