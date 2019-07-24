package Algorithm_1WEEK_D1;

public class Array_Class_gogo_190718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[0][2] = 12;
		arr[1][0] = 13;
		arr[1][1] = 14;
		arr[1][2] = 15;
		
		
		//arr 배열을 길이만큼 한바퀴 돌아요.
		for(int i = 0; i < arr.length; i++)
		{
			//arr[i]   <-  이녀석 이거 타입이 ?? 1차원 배열의 주소를 담는 정수배열 자료형
			//arr[i] 가 갖는 길이만큼 돌면서
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
