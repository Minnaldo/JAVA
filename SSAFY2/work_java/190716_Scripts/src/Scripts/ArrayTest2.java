package Scripts;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7 };
//		System.out.println(arr.length);
//		System.out.println(arr[2]);
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		int[] arr2 = new int[arr.length + 1];
		
//		arr2 = arr;	// arr�� �ؽ��±װ��� arr2�� ��.
		arr2 = arr;
		System.out.println(arr2.length);
		System.out.println(arr2[2]);
		
		
		//arr[2]�� arr2[2]�� ���� ���� ����Ű�� ����.
		//'���� ����'��� ��.
		arr[2] = 100;
		System.out.println("���� ���� �� : " + arr2[2]);
				
		//'���� ����' : ���� ���簡 �ż� �������� ������ ��ġ�� ����.
		//���� ���� �� �̷��� �밡�� �������� ������.
		//���� ������ �ݺ����� ����ؾ� ��.
		/*
		arr2[3] = arr[3];
		arr2[2] = arr[2];
		arr2[1] = arr[1];
		arr2[0] = arr[0];
		*/
		
		//foreach����
		// for(int i : arr2)	:  arr2 �迭��ŭ �ݺ�
		//			or
		//System.arraycopy(arr,  0,  arr2,  0,  4);
		//���� ���� �迭ī�Ǹ� ����ؼ� arr�迭�� ���� arr2 �迭�� 0~4��°���� �����ض� 
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		
		
		arr[2] = 50;
		System.out.println("���� ���� �� : " + arr2[2]);
		
		
		
	}

}
