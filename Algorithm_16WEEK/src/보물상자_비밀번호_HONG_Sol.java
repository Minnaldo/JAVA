import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 보물상자_비밀번호_HONG_Sol {

	static int T;
	static int N;
	static int K;
	static char[] arr;
	
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			String str = br.readLine();
			
			int s = N / 4;	//문자열 길이를 4로 나눈다.
			
			//HahSet은 중복 제거..
			//TreeSet은 중복 제거,, 하면서 정렬까지 해준다.
			Set<Integer> set = new TreeSet<>();
			
			for(int i = 0; i < s; i++) {
				int index = i;
				for(int j = index; j < index+N; j+=s) {
//					System.out.println(str.substring(j, j+s));
//					System.out.println(Integer.parseInt(str.substring(j, j+s), 16));
					set.add(Integer.parseInt(str.substring(j, j+s), 16));
				}
				str += str.charAt(index);
			}
			

			
			List<Integer> list = new LinkedList<Integer>(set);
			Collections.reverse(list);
			
//			System.out.println(list.toString());
			
			for(int i = 0; i < list.size(); i++) {
				if( i == K-1 ) {
					System.out.println("#" + tc + " " + list.get(i));
				}
			}
			
			
//			int idx = 0;
//			for(int num : set) {
//				if( set.size()-idx == K ) {
//					System.out.println("#" + tc + " " + num);
//				}
//				idx++;
//			}
			
			
			
		}
	}

}
