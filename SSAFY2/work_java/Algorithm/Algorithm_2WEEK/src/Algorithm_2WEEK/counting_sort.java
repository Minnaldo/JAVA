package Algorithm_2WEEK;

import java.util.Arrays;

public class counting_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 5, 5, 3, 4, 4, 2};
		
		//알려진 최대값을 인덱스로 저장할 수 있는 충분한 크기의 배열 생성.
		int[] count = new int[8];
		
		//각 자료들의 빈도수를 계산.
		for(int i = 0; i < arr.length; i++)
		{
			count[ arr[i] ]++;
		}
		
		System.out.print("각 자료들의 빈도수 : ");
		System.out.println(Arrays.toString(count));
		
		
		//누적합을 구하는 이유는??
		//
		//각 자료의 빈도수를 누적빈도로 변경.	[누적합 계산]
		for(int i = 1; i < count.length; i++)
			count[i] += count[i-1];
//		count[i] = count[i] + count[i-1];
		
		//정렬된 자료를 저장할 배열을 준비.
		int[] sorted_arr = new int[arr.length];
		
		//각 자료를 빈도수배열을 참조하여 적절한 위치에 배치.
		for(int i = 0; i < arr.length; i++)
		{
			//자료값에 해당하는, 카운팅 배열에서의 인덱스의 값 -1 위치에 배치.
			sorted_arr[--count[arr[i]]] = arr[i];
			
			//2 문장을 위 한 문장으로 줄일 수 있다.
//			int my_index = count[arr[i]] - 1;
//			sorted_arr[my_index] = arr[i];
			
//			배치를 마쳤으니 해당 숫자의 카운트 하나 감소.
//			count[arr[i]]--;
		}
		
		System.out.print("카운팅 배열 수 : ");
		System.out.println(Arrays.toString(sorted_arr));
		
	}

}