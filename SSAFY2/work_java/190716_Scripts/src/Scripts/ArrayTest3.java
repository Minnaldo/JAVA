package Scripts;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형 배열 3개짜리가 2묶음 있다.
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 13;
		arr[0][2] = 21;
		arr[1][0] = 33;
		arr[1][1] = 44;
		arr[1][2] = 55;
		
		//int[2][3]의 length 값은 6이 아니라,,  2!!!
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.println(arr[i][j]); 
			}
		}
		
		System.out.println("===================");
		//처음 선언을 [][] 로만 하고  뒤에  int[3][]로 내가 쓰고 싶은 만큼 배열을 선언할 수 있다.
		//아래와 같이 포인터배열로 내가 사용하고 싶은만큼 크기의 배열 선언 가능!
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[10];
		arr2[2] = new int[11];
		
		// 2x3 배열이 되는거임. 내가 선언한 만큼
		int[][] arr3 = {{3,5,7}, {12, 25, 66}};
		
		for (int i = 0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3.length; j++)
			{
				System.out.println(arr3[i][j]);
			}
		}
	}

}
