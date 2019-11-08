import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 수정렬하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet<>();
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int tc = 0; tc < N; tc++) {
			set.add(sc.nextInt());
		}

		List<Integer> list = new ArrayList<Integer>(set);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
