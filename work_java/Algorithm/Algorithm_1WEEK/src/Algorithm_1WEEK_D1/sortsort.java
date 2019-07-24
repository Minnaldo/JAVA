package Algorithm_1WEEK_D1;

import java.util.Arrays;

public class sortsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선택 정렬 (Selection Sort)
		int[] arr = { 7, 4, 2, 8, 9, 6, 3, 5, 0, 1 };

		// 첫번째 인덱스에 있는 값을 제일 크다고 가정하고 시작.
		// 배열을 반복문으로 돌면서 큰 값이 발견되면 발견된 값을 저장.

		for (int j = 0; j < arr.length; j++) {

			int max = arr[j];
			int max_index = j;

			for (int i = j; i < arr.length; i++) {
				// 현재 탐색중인 arr의 i가 max보다 크다면,
				// max에 i를 저장.
				if (max < arr[i]) {
					max = arr[i];
					max_index = i;
				}
			}

			int tmp = arr[j];
			arr[j] = arr[max_index];
			arr[max_index] = tmp;
		}
		//Arrays.toString() 을 사용하면
		//반복문을 돌리지 않아도  볼 만 하게 출력이 된다.
		System.out.println(Arrays.toString(arr));
	}	
}