import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		comb(arr, 0, 0, new int[7]);
	}
	static boolean isFinished = false;
	static void comb(int[] arr, int n, int c, int[] sel) {
		if( c == sel.length ) {
			if(isFinished)
				return;
			//요 지점에서 조건검사.
			int sum = 0;
			for(int i = 0; i < sel.length; i++)
				sum += sel[i];
			if( sum == 100) {
				isFinished = true;
				Arrays.sort(sel);
				for(int s : sel)
					System.out.println(s);
			}
			return;
		}
		if( n == arr.length ) return;
		
		sel[c] = arr[n];
		comb(arr, n+1, c+1, sel);
		comb(arr, n+1, c, sel);
	}
	
}






