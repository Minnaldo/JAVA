package Scripts;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int�� �迭 3��¥���� 2���� �ִ�.
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 13;
		arr[0][2] = 21;
		arr[1][0] = 33;
		arr[1][1] = 44;
		arr[1][2] = 55;
		
		//int[2][3]�� length ���� 6�� �ƴ϶�,,  2!!!
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.println(arr[i][j]); 
			}
		}
		
		System.out.println("===================");
		//ó�� ������ [][] �θ� �ϰ�  �ڿ�  int[3][]�� ���� ���� ���� ��ŭ �迭�� ������ �� �ִ�.
		//�Ʒ��� ���� �����͹迭�� ���� ����ϰ� ������ŭ ũ���� �迭 ���� ����!
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[10];
		arr2[2] = new int[11];
		
		// 2x3 �迭�� �Ǵ°���. ���� ������ ��ŭ
		int[][] arr3 = {{3,5,7}, {12, 25, 66}};
		
		for (int i = 0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3.length; j++)
			{
				System.out.println(arr3[i][j]);
			}
		}
	}

}
