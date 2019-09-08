package AD;

import java.util.Arrays;

public class 순열 {

	static int[] arr = {1, 2, 3, 4};
	static int[] brr= new int[2];
	static boolean[] visited = new boolean[arr.length];
	
	public static void main(String[] args) {
		perm(0);
	}
	
	static void perm(int c)
	{
		if(c == brr.length)
		{
			System.out.println(Arrays.toString(brr));
			return;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(visited[i] == false)
			{
				brr[c] = arr[i];
				visited[i] = true;
				perm(c+1);
				visited[i] = false;
			}
		}
	}
}
