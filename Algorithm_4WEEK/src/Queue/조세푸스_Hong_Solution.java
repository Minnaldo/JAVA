package Queue;

import java.util.Scanner;

public class 조세푸스_Hong_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr =  new int[N];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		
		int idx = 0;
		int cnt = 0;
		int outputCnt = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(true)
		{
			if(arr[idx % N] != -1)
			{
				cnt++;
			}
			
			//cnt가 K 되면 따 할 차례
			if (cnt == M)
			{
//				System.out.println(arr[idx % N]);
				sb.append(arr[idx%N]).append(", ");
				cnt = 0;
				outputCnt++;
				arr[idx % N] = -1;
				if(outputCnt == N)
					break;
			}
			idx++;
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb.toString());
	}

}
