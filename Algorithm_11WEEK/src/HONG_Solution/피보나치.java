
public class 피보나치 {
	public static void main(String[] args) {
		memo = new int[100];
		long start = System.currentTimeMillis();
//		System.out.println(fibo(99));
		System.out.println(fibo_dp(99));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	static int fibo_dp(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	static int[] memo;
	static int fibo(int n) {
		if(memo[n] != 0)  //n번째에 대한 기억이 있으면 재사용!!	
			return memo[n];
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		memo[n]	= fibo(n-1) + fibo(n-2);//n번째는 이거야!! 라고 기억
		return memo[n];
	}
}
