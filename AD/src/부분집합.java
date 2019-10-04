import java.util.Scanner;

public class 부분집합 {

	static int[] arr;
	static int[] result;
	static boolean[] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[N];
		result = new int[M];
		visited = new boolean[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		powerSet(0);
	}
	
	static void powerSet(int idx) {
		if(idx == arr.length) {
			for(int i = 0; i < arr.length; i++) {
				if(visited[i] == true)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		visited[idx] = true;
		powerSet(idx+1);
		visited[idx] = false;
		powerSet(idx+1);
	}

}
