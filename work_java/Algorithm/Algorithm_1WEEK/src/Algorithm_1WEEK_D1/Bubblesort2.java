package Algorithm_1WEEK_D1;

import java.util.Arrays;

public class Bubblesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 7, 4, 2, 8, 9, 6, 3, 5, 0, 1 };
		
		System.out.print("버블정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		
		int cnt = 0;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 1; j < arr.length; j++)
			{
				cnt++;
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("버블정렬 후 : ");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("정렬 횟수 : ");
		System.out.println(cnt);
	}

}
