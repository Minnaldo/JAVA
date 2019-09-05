import java.util.Arrays;

public class 순열과조합간단정리Test {

	static int[] arr = {1, 2, 3, 4};
	static boolean[] visited;
	static int[] result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		visited = new boolean[arr.length];
		
		//4개 중 2개 뽑은 연습!!!
		result = new int[2];
		System.out.println("***순열 결과***");
		perm(0);
	}
	
	static void perm(int c)
	{
		if( c == result.length )
		{
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for( int i = 0; i < arr.length; i++ )
		{
			//방문한 적 없다면!
			if(visited[i] == false)
			{
				result[c] = arr[i];
				visited[i] = true;
				perm(c+1);
				visited[i] = false;
			}
		}
	}
	
	
	//조합은 인자가 두 개  (출력 배열의 인덱스 / arr 인덱스)
	//조합의 기저도 두 개
	static void combination(int n, int c)
	{
		if(c == result.length)
		{
			System.out.println(Arrays.toString(result));
			return;
		}
		
		if(n == arr.length)
			return;
		
		result[c] = arr[n];
		combination(n+1, c+1);
		combination(n+1, c);
	}

}
