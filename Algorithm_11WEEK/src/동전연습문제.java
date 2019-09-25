
public class 동전연습문제 {
	public static void main(String[] args) {
		int[] coins = {1,5,10,16};
		//1차원 배열로 만들어보기
		int[] dp = new int[101];
		//1원으로 거슬러 주는 경우
		for(int i = coins[0]; i < 101; i++)
			dp[i] = dp[i-coins[0]] + coins[0];
		
		//1원과 5원으로 주는 경우
		for(int i = coins[1]; i < 101; i++)
			dp[i] = Math.min(dp[i], dp[i-coins[1]] + 1);

		//1원과 5원과 10원으로 주는 경우
		for(int i = coins[2]; i < 101; i++)
			dp[i] = Math.min(dp[i], dp[i-coins[2]] + 1);
		
		//1원과 5원과 10원, 16원으로 주는 경우
		for(int i = coins[3]; i < 101; i++)
			dp[i] = Math.min(dp[i], dp[i-coins[3]] + 1);
		System.out.println(dp[100]);
		
//		//dp테이블은... 0행은 0번째 동전만 고려했을때의 최적해
//		//1행은 0번째와 1번째를 고려했을때의 최적해
//		//..
//		//n번행은 0번째 .. n번째를 고려했을때의 최적해
//		//열 은 그 금액을 거슬러 주기 위한 최적해
//		int[][] dp = new int[coins.length][101];
//		
//		//첫행은 그냥 채웁니다
//		for(int j = 0; j < dp[0].length; j++) {
//			dp[0][j] = j;
//		}
//		for(int i = 1; i < coins.length; i++) {
//			for(int j = 0; j < dp[i].length; j++) {
//				if( j >= coins[i] )
//					dp[i][j] = Math.min(dp[i][j-coins[i]] + 1, dp[i-1][j]);
//				else
//					dp[i][j] = dp[i-1][j];
//			}
//		}
//		System.out.println(dp[coins.length-1][100]);
	}
}






