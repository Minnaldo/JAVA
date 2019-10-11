package 중복순열_순열;

public class 중복순열 {

	static int[] arr = {1, 3, 5};
	static int[] result = new int[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		re_Perm(0);
		
	}
	
	static void re_Perm(int idx) {
		if(idx == result.length) {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < result.length; i++) {
			result[idx] = arr[i];
			re_Perm(idx+1);
		}
	}

}
