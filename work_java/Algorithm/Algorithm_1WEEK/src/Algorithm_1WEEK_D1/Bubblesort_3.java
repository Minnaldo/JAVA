package Algorithm_1WEEK_D1;

import java.util.Arrays;

public class Bubblesort_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 6, 3, 4, 1, 2 };

		System.out.print("버블정렬 전 : ");

		System.out.println(Arrays.toString(arr));

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++)
				//작은 인덱스 값이 큰 인덱스 값보다 크면,
				//위치변경  ,,  따라서 작은수부터 큰수로 정렬
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
		}

		System.out.print("버블정렬 후 : ");
		System.out.println(Arrays.toString(arr));

		int temp2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++)
				//작은 인덱스 값이 큰 인덱스 값보다 작으면,
				//위치변경  ,,  따라서 큰수부터 작은수로 정렬.
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
		}

		System.out.print("버블정렬, 내림차순 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}