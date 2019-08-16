package Tree;

public class 재귀함수 {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,4,7,9,8,0,6};
		recur(10, 0, arr);

	}
	
	static void recur(int n, int idx, int[] arr)
	{
		//기저파트(재귀 함수가 종료되는 조건)
		if (idx == n)
			return;
		
		//doSomething
//		System.out.println(idx);
		System.out.println(arr[idx]);
		
		//재귀호출
		recur(n, idx+1, arr);
	}
	
}
