package Algorithm_3WEEK;

import java.time.chrono.IsoChronology;

public class fiboMain {

	/**기존에 있던 연산은 기억하고 있다가 안하고
	 * 하는것을 메모이제이션!!! 이라고 한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isCalled);
		long start = System.currentTimeMillis();
		System.out.println(fibo(1000));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

//	static boolean isCalled = false;
	static int[] memo = new int[100000];
	static int fibo(int n)
	{
//		isCalled = true;
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		if ( memo[n] == 0)
			memo[n] = fibo(n-1) + fibo(n-2);
		return memo[n];
	}
}
