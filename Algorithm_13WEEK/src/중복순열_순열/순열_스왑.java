package 중복순열_순열;

public class 순열_스왑 {

	static int[] arr = {1, 3, 5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm(0);
	}
	
	static void perm(int idx) {
		if( idx == arr.length ) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = idx; i < arr.length; i++) {
			swap(i, idx);
			perm(idx+1);
			swap(i, idx);
		}
	}
	
	static void swap(int a, int b) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
