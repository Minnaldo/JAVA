package AD;

import java.util.Scanner;

public class 로마숫자_중복조합 {

	static int N;
	static int[] arr = {1, 5, 10, 50};
	static Scanner sc = new Scanner(System.in);
	static boolean[] visited = new boolean[1001];
	static String str;
	static int cnt;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		recur(0, 0, 0);
		System.out.println(cnt);
	}
	
	static void recur(int n, int c, int sum)
	{
		if(c == N)
		{
			if(visited[sum] == false)
			{
				cnt++;
				visited[sum] = true;
			}
			return;
		}
		
		for(int i = n; i < arr.length; i++)
		{
			int temp = arr[i];
			recur(i, c+1, sum+temp);
		}
	}
}
