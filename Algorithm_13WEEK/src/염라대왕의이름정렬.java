import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 염라대왕의이름정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {		
			int N = Integer.parseInt(br.readLine());
			TreeSet<String> set = new TreeSet<>();
			for(int i = 0; i < N; i++) {
				set.add(br.readLine());
			}
			
			LinkedList<String> list = new LinkedList<>();
			list.addAll(set);
			
			Collections.sort(list, new Comparator<String>() {
			
				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					if(o1.length() == o2.length())
						return o1.compareTo(o2);
					
					return o1.length() - o2.length();
				}
			});
			
			bw.write("#"+tc+"\n");
			for(int i = 0; i < list.size(); i++) {
				bw.write(list.get(i)+"\n");
			}
			bw.flush();
			
		}
	}

}
