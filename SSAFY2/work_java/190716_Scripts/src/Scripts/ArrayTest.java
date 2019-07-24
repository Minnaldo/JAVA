package Scripts;

public class ArrayTest {
	/* Array
	 * 정의 : 같은 데이터 타입의 순서적 나열 (자료구조 중 가장 빠른 검색이 가능하다.)
	 * 특징 : 선언과 동시에 크기가 결정되어 한 번 결정된 크기는 변경불가.
	 * 배열은 생성하면 타입에 따라 기본값으로 초기화
	 * 정수 : 0, 실수 : 0.0 , 문자: /u0000m 논리 : false, 참조(reference) : null
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
		System.out.println(arr2[0]); 	//안보이지만 값이 출력됨.
		boolean[] arr3 = new boolean[3];
		System.out.println(arr3[0]);
		
		System.out.println(arr3.length);
		
		testFunc(jumsu);
		System.out.println("main kor(jumsu[0]) : " + jumsu[0]);
		
		Member n1 = new Member();
		Member n2 = new Member();
		Member n3 = new Member();
		
		//Member 타입의 배열!!!
		Member[] marr = new Member[3];
		marr[0] = n1;
		marr[1] = n2;
		marr[2] = n3;
		
		
	}

	//testFunc의 배열과과 main 함수 배열이 연결됨.
	//call by reference 임.
	public static void testFunc(int[] arr)
	{
		arr[0]--;
		System.out.println("testFunc kor(arr[0]): " + arr[0]);
		System.out.println("arr 배열의 길이 : " + arr.length);
	}
}
