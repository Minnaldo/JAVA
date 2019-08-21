import java.util.Arrays;

public class 재귀함수 {
	public static void main(String[] args) {
//		int[] arr = {7,2,4};
//		powerset(arr, 0, new boolean[arr.length]);
//		int[] arr = {3,1,4,5,2};
//		combination(arr, 0, 0, new int[3]);
//		int[] arr = {1,2,3};
//		re_perm(arr, 0, new int[2]);
		int[] arr = {1,2,3,4};
		perm(arr, 0, new int[3], new boolean[4]);
	}
	
	
	static void perm(int[] arr, int c, int[] result, boolean[] visited) {
		if( c == result.length) {
			System.out.println(Arrays.toString(result));
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			
			if( !visited[i] ) {
				visited[i] = true;
				result[c] = arr[i];
				perm(arr, c+1, result, visited);
				visited[i] = false;
			}
		}
		
	}

	static void re_perm(int[] arr, int c, int[] result) {
		if( c == result.length ) {
			System.out.println(Arrays.toString(result));
			return;
		}
		//재귀 호출을 어떻게 해야 중복순열이 만들어질까?
		for(int i = 0; i < arr.length; i++) {
			result[c] = arr[i];
			re_perm(arr, c+1, result);
		}
	}
	
	
	//n은 현재 고를까 말까 하는 위치를 가리키는 변수
	//c는 이번 고른걸 담을 위치의 변수
	static void combination(int[] arr, int n, int c, int[] sel) {
		if( c == sel.length ) {
			//다고른것
			System.out.println(Arrays.toString(sel));
			return;
		}
		if( n == arr.length) {
			//끝난것
			return;
		}
		sel[c] = arr[n];
		//n번째에 대해서. sel에 담고 지나가기
		combination(arr, n+1, c+1, sel);
		//n번째에 대해서. sel에 안담고 지나가기
		combination(arr, n+1, c, sel);
		
	}
	static void powerset(int[] arr, int idx, boolean[] sel) {
		if( idx == arr.length ) {
			for(int i = 0; i < arr.length; i++) {
				if( sel[i] )
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			return;
		}
		sel[idx] = false;
		powerset(arr, idx+1, sel);
		sel[idx] = true;
		powerset(arr, idx+1, sel);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void recur(int n, int idx, int[] arr) {
		//기저파트(재귀 함수가 종료되는 조건)
		if( idx == n )
			return;
		
		//doSomething
//		System.out.println(idx);
		System.out.println(arr[idx]);
		
		//재귀호출
		recur(n, idx+1, arr);
	}
}









