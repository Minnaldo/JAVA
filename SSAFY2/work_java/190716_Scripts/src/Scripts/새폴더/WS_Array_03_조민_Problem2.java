package Scripts;

import java.util.Scanner;

public class WS_Array_03_Chomin_Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ζ��� �ְ���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int idx = 0;
		int max = sc.nextInt();
		
		for (int i = 0; i < lotto.length; i++)
		{
			int val = (int) (Math.random() * 100 % max + 1);
			
			//�ߺ�üũ
			boolean jungbok = true;
			
			for (int j = 0; j < idx; j++) {
				if (val == lotto[j]) {
					jungbok = false;
					
					break;
				}		
			}
			
			if (jungbok == false)
			{
				i--;
				continue;
			}
			
			lotto[idx] = val;
			idx++;
		}		
		
		for (int i : lotto)
		{
			System.out.println(i);
		}
		
		
		
	}

}
