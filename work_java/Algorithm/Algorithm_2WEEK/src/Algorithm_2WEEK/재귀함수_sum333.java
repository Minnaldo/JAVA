package Algorithm_2WEEK;

//재귀함수 : 자기 자신을 호출하는 함수
public class 재귀함수_sum333 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 3;
//		recur(n, 0);
//	
//		System.out.println("=====끝=====");
		
		int[] arr = {1,2,3,4};
		traversalArr(arr, 0);
		
		traversalArr2(arr, 0, 0);
		
	}
	
	static int sum2 = 0;
	//배열순회  [전부 다 탐색가능]
	static void traversalArr(int[] arr, int idx)
	{
		if( idx == arr.length)
		{
			System.out.println("sum = " + sum2);
			return;
		}
		
		System.out.println(arr[idx]);
		sum2 += arr[idx];
		traversalArr(arr, idx+1);
		
	}
	
	
	static int sum3 = 0;
	//배열순회  [전부 다 탐색가능]
	static void traversalArr2(int[] arr, int idx, int sum)
	{
		if( idx == arr.length)
		{
			System.out.println("traversalArr2 배열로 합 구하기 : sum을 인자로 끝");
			System.out.println("sum = " + sum2);
			return;
		}
		
		System.out.println(arr[idx]);
		sum2 += arr[idx];
		traversalArr2(arr, idx+1, sum + arr[idx]);
		
	}
	
	
	
	/*2번째 재귀함수_합 방법,, => sum을 들고 다닌다.*/
	
	static int sum = 0;		//호출스택공간보다 하나 밖 영역에 변수를 만들어두고
	static void recur(int n, int sum)
	{
		
		if(n == 0) {		//일반적인 재귀함수는 기저영역 이라고 해서
			System.out.println("sum = " + sum);
			return;		//특정 조건이 되면 함수를 종료시키는 조건문을 갖게됨.
		}
		
		System.out.println(n);		
								
		recur(n-1, sum + n);		
		//재귀적으로 자신을 호출할때는, 기저영역에서 검사되는 조건에
		//해당하는 값을 변화시키는게 일반적이겠죠.
		
	}
}
