package Algorithm_2WEEK;

public class 재귀함수_subsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		
		subsum(arr, 0, 0);
	}

	static void subsum(int[] arr, int idx, int sum)
	{
		if (idx == arr.length)
		{
			System.out.println(sum);
			return;
		}
		
		subsum(arr, idx+1, sum);
		subsum(arr, idx+1, sum + arr[idx]);
	}
	
}
