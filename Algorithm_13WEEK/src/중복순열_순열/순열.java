package 중복순열_순열;

public class 순열 {

	static int[] arr = {1, 3, 5};
	static int[] result = new int[3];
	static boolean[] visited = new boolean[arr.length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static public void perm(int idx) {
		for(int i = 0; i < arr.length; i++) {
			if(visited[i] == false) {
				result[idx] = arr[i];
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
	}

}
