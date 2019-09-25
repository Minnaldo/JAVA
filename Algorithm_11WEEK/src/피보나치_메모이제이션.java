
public class 피보나치_메모이제이션 {

	public static void main(String[] args) {
		memo = new int[100];
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println("fibo = " + fibo(99));
		System.out.println("fibo_dp = " + fibo_dp(99));
		System.out.println("getStick = " + getStick(5));
		System.out.println("fibo_RYB = " + getStick_dp(5));
		long end = System.currentTimeMillis();
		System.out.println("end = " + end);
		System.out.println(end- start);
		
	}
	
	//상향식과 하향식은 각자 유리한 상황이 있음. (굉장히 주관적으로)
	//그렇지만 둘 다 문제없는 상황이라면
	//일반적으로 상향식이 성능이 좋은편 ㅋ(함수 콜 오버헤드 없응께)
	
	
	/** 상향식 DP **/
	static int fibo_dp(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	/** 하향식 DP **/
	static int[] memo;
	static int fibo(int n) {
		if(memo[n] != 0)	//n번쨰에 대한 기억이 있으면 재사용!!
			return memo[n];
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		memo[n] = fibo(n-1) + fibo(n-2);	//n번째는 이거야!! 라고 기억
		return memo[n];
	}
	
	static long[] memo2;
	static long getStick(int n) {
		if( memo2[n] != 0 )
			return memo2[n];
		if( n == 1 )
			return 2;
		if( n == 2 )
			return 5;
		memo2[n] = getStick(n-1) * 2 + getStick(n-2);
		return memo2[n];
	}
	
	static long getStick_dp(int n) {
		long[] dp = new long[n+1];
		dp[1] = 2;
		dp[2] = 5;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] * 2 + dp[i-2];
		}
		
		return dp[n];
	}
	
}
