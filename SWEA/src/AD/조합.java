package AD;

import java.util.Arrays;

public class 조합 {

	static int[] arr = {1, 2, 3, 4};
	static int[] brr = new int[2];
	
	public static void main(String[] args) {
		combination(0, 0);
	}
	
	static void combination(int n, int c)
	{
		if(c == brr.length)
		{
			System.out.println(brr);
			return;
		}
		if(n == arr.length)
		{
			return;
		}
		
		brr[c] = arr[n];
		combination(n+1, c+1);
		combination(n+1, c);
	}
}
