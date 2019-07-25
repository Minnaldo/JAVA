package Algorithm_2WEEK;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9, 10};
		int left = 0;
		int right = arr.length-1;
		//원하는 값을 못 찾았을때의 right의 의미 
		// -> 같거나 작은 최대값. 
		
		
		//내가 찾는 값;
		int target = 3;
		while(left <= right)
		{
			//가운데 값을 방문해보자.
			int mid = (left + right) / 2;
			System.out.println("arr[mid] = " + arr[mid]);
			
			//내가 찾는 값이 mid 위치보다 더 크다면, mid 포함, mid 왼쪽부분은 볼 필요 없다.
			//그러니까 mid의 하나 오른쪽이 left가 됨.
			if (arr[mid] < target)
				left = mid + 1;
			else if( arr[mid] > target)
				right = mid - 1;
			//둘이 같다면 목표를 찾은것.
			else
			{
				right = mid;
				break;
			}
			
		}
		
		System.out.println("left = " + left + " " + "right = " +  right);
	}

}
