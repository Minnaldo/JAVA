package Baekjoon;
import java.util.Scanner;

public class N과M_1__TEO {

	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();		//입력1
		int M = scan.nextInt();		//입력2
		int[] arr = new int[N];		//N과M 문제에서 큰 수가 N이라 N만큼 배열을 만듦.
		String str = "";			//출력하기 위해 사용할 빈 스트링 값.

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;			//arr배열에 순차적으로 1부터 N만큼 값을 넣어둠.
		}
		visited = new boolean[N];	//방문했는지 방문체크 배열을 만듦.
		dfs(arr, N, M, str);		//순열 체크를 위해 함수로 체크.
	}
	
	//arr에 담겨있는 수열을 이용하기 위해 가지고, N,M은 입력값, str은 string 빈칸으로 붙여 출력하기 위해
	static void dfs(int[] arr, int N, int M, String str) {
		if (str.length() == M) {		//str 길이가 M만큼이면 출력,,
			for (int i = 0; i < M; i++) {
				System.out.print(str.charAt(i) + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {	//방문 배열을 체크해주기 위해, ex) F F F
				visited[i] = true;	// 방문했다면 체크를 하지 않기 위해, 방문배열을 true로 바꿔준다. 

				//str이 값이 출력되고 나면, 스택에 쌓여있던게 날아가기 때문에, 다시 str = "" 빈칸으로 된다.
				dfs(arr, N, M, str+arr[i]);	//arr배열의 i번째 인덱스 값을 string 빈칸에 붙여주고, 순열 체크를 위해 재귀함수 호출.
				
				visited[i] = false;	//순열 체크하고 출력 후, 재귀함수가 return을 하면, 방문체크 배열을 다시 쓰기위해 false로 초기화 해준다.

			}

		}
	}
}