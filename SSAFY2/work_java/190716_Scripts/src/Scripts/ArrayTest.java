package Scripts;

public class ArrayTest {
	/* Array
	 * ���� : ���� ������ Ÿ���� ������ ���� (�ڷᱸ�� �� ���� ���� �˻��� �����ϴ�.)
	 * Ư¡ : ����� ���ÿ� ũ�Ⱑ �����Ǿ� �� �� ������ ũ��� ����Ұ�.
	 * �迭�� �����ϸ� Ÿ�Կ� ���� �⺻������ �ʱ�ȭ
	 * ���� : 0, �Ǽ� : 0.0 , ����: /u0000m �� : false, ����(reference) : null
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 100, math = 80, eng = 50;
		int sum = kor + math + eng;
		System.out.println(sum);
		System.out.println("==================");
		
		int[] jumsu = new int[3];
		jumsu[0] = 100;
		jumsu[1] = 80;
		jumsu[2] = 50;
		
		sum = jumsu[0] + jumsu[1] + jumsu[2];
		System.out.println(sum);
		
		float [] arr1 = new float[3];
		System.out.println(arr1[0]);
		char[] arr2 = new char[3];
		System.out.println(arr2[0]); 	//�Ⱥ������� ���� ��µ�.
		boolean[] arr3 = new boolean[3];
		System.out.println(arr3[0]);
		
		System.out.println(arr3.length);
		
		testFunc(jumsu);
		System.out.println("main kor(jumsu[0]) : " + jumsu[0]);
		
		Member n1 = new Member();
		Member n2 = new Member();
		Member n3 = new Member();
		
		//Member Ÿ���� �迭!!!
		Member[] marr = new Member[3];
		marr[0] = n1;
		marr[1] = n2;
		marr[2] = n3;
		
		
	}

	//testFunc�� �迭���� main �Լ� �迭�� �����.
	//call by reference ��.
	public static void testFunc(int[] arr)
	{
		arr[0]--;
		System.out.println("testFunc kor(arr[0]): " + arr[0]);
		System.out.println("arr �迭�� ���� : " + arr.length);
	}
}
