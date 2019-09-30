import java.util.Scanner;

public class 최장증가부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int[] lis = new int[N];
			int ans = 0;
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				//내 앞에놈들을 검사하면서
				int max = 0;
				for(int j = 0; j < i; j++) {
					//나보다 작은놈 중에서 가장 긴 증가수열의 길이를 갖고 있는 놈을 찾자.
					if( arr[j] < arr[i] && max < lis[j] ) {
						max = lis[j];
					}
				}
				//걔 뒤에 붙으면 내가 가질 수 있는 가장 긴 증가수열의 길이
				lis[i] = max + 1;
				ans = Math.max(ans, lis[i]);
			}
			System.out.println("#" + tc + " " + ans); 
		}
	}
}





