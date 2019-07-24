
public class Test {
	
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[0][2] = 13;
		arr[1][0] = 15;
		arr[1][1] = 17;
		arr[1][2] = 19;
		
		//arr배열을 길이만큼 한바퀴 돌아요.
		for(int i = 0; i < arr.length; i++) {
			// arr[i]  ←  이녀석 이거 타입이 ?? 1차원배열의 주소를 담는 정수배열 자료형
			//arr[i]가 갖는 길이만큼 돌면서
			for(int j = 0; j < arr[i].length; j++)
			{
				//arr[i][j] ← 각각의 값 :)
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
