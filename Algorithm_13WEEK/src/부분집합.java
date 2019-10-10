
public class 부분집합 {
	public static void main(String[] args) {
		powerSet(0);
	}
	static int[] arr = {1,3,5};
	static boolean[] sel = new boolean[3];
	static void powerSet(int idx) {
		//idx가 3이 되면 기저파트
		if( idx == 3 ) {
			//sel상황에 맞게 무언가 작업.
			for(int i = 0; i < 3; i++) {
				if(sel[i])
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		sel[idx] = false;
		powerSet(idx+1);
		sel[idx] = true;
		powerSet(idx+1);
		
	}
}





