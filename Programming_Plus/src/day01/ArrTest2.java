package day01;

public class ArrTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[6]  ->  [][][][][][]		//하나의 묶음 ex)국영수과사
		int[] arr = new int[6];
		int[] arr2 = {1,2,3,4,5,6};
		
		
		//int[2][3]  ->  [][][] [][][]	//2개의 묶음 ex)국영수, 국영수
		int[][] arr3 = new int[2][3];
		int[][] arr4 = {{1,2,3}, {4,5,6}};
		
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr2[i] + " ");
		
		System.out.println();
		System.out.println("================");
		
		for (int i = 0; i < arr4.length; i++) {
			for(int j = 0; j < arr4[i].length; j++)
			{
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
