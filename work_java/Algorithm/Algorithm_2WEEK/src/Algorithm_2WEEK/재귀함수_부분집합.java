package Algorithm_2WEEK;

import java.util.Arrays;

public class 재귀함수_부분집합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] sel = new boolean[3];
		powerset(sel, 0);
	}
	
	static void powerset(boolean[] sel, int idx)
	{
		if(idx == sel.length)
		{
			System.out.println(Arrays.toString(sel));
			return;
		}
	
		sel[idx] = true;
		powerset(sel, idx + 1);
		sel[idx] = false;
		powerset(sel, idx + 1);
		
	}
}
