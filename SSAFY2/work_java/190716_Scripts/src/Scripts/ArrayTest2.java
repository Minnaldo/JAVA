package Scripts;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7 };
//		System.out.println(arr.length);
//		System.out.println(arr[2]);
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		int[] arr2 = new int[arr.length + 1];
		
//		arr2 = arr;	// arr의 해시태그값이 arr2에 들어감.
		arr2 = arr;
		System.out.println(arr2.length);
		System.out.println(arr2[2]);
		
		
		//arr[2]와 arr2[2]는 같은 곳을 가리키고 있음.
		//'얕은 복사'라고 함.
		arr[2] = 100;
		System.out.println("얕은 복사 후 : " + arr2[2]);
				
		//'깊은 복사' : 값이 복사가 돼서 원본에는 영향을 미치지 않음.
		//수가 적을 때 이렇게 노가다 형식으로 하지만.
		//수가 많으면 반복문을 사용해야 함.
		/*
		arr2[3] = arr[3];
		arr2[2] = arr[2];
		arr2[1] = arr[1];
		arr2[0] = arr[0];
		*/
		
		//foreach구문
		// for(int i : arr2)	:  arr2 배열만큼 반복
		//			or
		//System.arraycopy(arr,  0,  arr2,  0,  4);
		//위와 같이 배열카피를 사용해서 arr배열의 값을 arr2 배열에 0~4번째까지 복사해라 
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		
		
		arr[2] = 50;
		System.out.println("깊은 복사 후 : " + arr2[2]);
		
		
		
	}

}
