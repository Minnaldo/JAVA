package Scripts;

import java.util.Scanner;

public class HW_Array_03_Chomin_Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//0~9 ���� ������� �迭 10�� ����.
		int[] arr = new int[10];
		
		int input = sc.nextInt();
				
		while(true)
		{																																
			if (input / 10 == 0)
				arr[0]++;
			else if (input / 10 == 1)
				arr[1]++;		
			else if (input / 10 == 2)
				arr[2]++;			
			else if (input / 10 == 3)
				arr[3]++;			
			else if (input / 10 == 4)
				arr[4]++;			
			else if (input / 10 == 5)
				arr[5]++;			
			else if (input / 10 == 6)
				arr[6]++;			
			else if (input / 10 == 7)
				arr[7]++;			
			else if (input / 10 == 8)
				arr[8]++;			
			else if (input / 10 == 9)
				arr[9]++;
			
			if(input == 0)
				break;
								
			input = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++)
		{					
			if (arr[i] >= 1)
			{
				System.out.println(i + " : " + arr[i] + "개");
			}
		}		
	}
}