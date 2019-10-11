import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class 염라대왕의이름정렬_HONGSOLUTION {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			TreeSet<String> names = new TreeSet<>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					if( o1.length() == o2.length() )
						return o1.compareTo(o2);
					return Integer.compare(o1.length(), o2.length());
				}
			});
			
			for(int i = 0; i < N; i++)
				names.add(br.readLine());
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append("\n");
			for(String s : names)
				sb.append(s).append("\n");
			System.out.print(sb);
			
		}
	}

}
