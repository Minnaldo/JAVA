package Algorithm_1WEEK_D1;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_D1_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();		//input
		int[] arr = new int[input];		//������ ���� �迭
		
		//�迭�� ������ ��´�.
		for (int tc = 0; tc < input; tc++)
		{
			arr[tc] = sc.nextInt();
		}
		
		//�������� �迭 ����.
		Arrays.sort(arr);
				
		//������������ �迭 ���� ��,,
		//�迭�� �ε����� 2�� ������ �߰����� ����Ѵ�.
		//���ǿ��� Ȧ�� ������ŭ �Է��ϱ� ������ 2�� �����⸸ �ϸ� ��.
		System.out.print(arr[input / 2]);	
	}
}