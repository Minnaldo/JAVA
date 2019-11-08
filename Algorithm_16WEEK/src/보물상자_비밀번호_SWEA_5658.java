import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 보물상자_비밀번호_SWEA_5658 {

	static int T;
	static int N;
	static int K;
	static char[] arr;
	static char[] first_cir;
	static char[] second_cir;
	static char[] third_cir;
	static String[] result;


	static BufferedReader br;
	static BufferedWriter bw;
//	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			arr = new char[N];
			String str = br.readLine();
			for(int i = 0; i < N; i++) {
				arr[i] = str.charAt(i);
			}

			first_cir = new char[N+1];
			second_cir = new char[N+1];
			third_cir = new char[N+1];


			//1회전
			for(int i = 0; i < N; i++) {
				//				zero_cir[i] = arr[i];
				first_cir[i] = arr[i];
			}
			for(int i = 0; i < N; i++) {
				first_cir[N-i] = first_cir[N-i-1];
			}
			first_cir[0] = first_cir[N];


			//2회전
			for(int i = 0; i < N; i++) {
				second_cir[i] = first_cir[i];
			}
			for(int i = 0; i < N; i++) {
				second_cir[N-i] = second_cir[N-i-1];
			}
			second_cir[0] = second_cir[N];

			//3회전
			for(int i = 0; i < N; i++) {
				third_cir[i] = second_cir[i];
			}
			for(int i = 0; i < N; i++) {
				third_cir[N-i] = third_cir[N-i-1];
			}
			third_cir[0] = third_cir[N];


			
			
			result = new String[N];
			for(int i = 0; i < N; i++) {
				StringBuilder sb = new StringBuilder();
				if(i%(N/4)==(N/4)-1) {
					sb.append(first_cir[i-2]);
					sb.append(first_cir[i-1]);
					sb.append(first_cir[i]);
				}
				
				result[i] = sb.toString();
			}
			
			System.out.println(result[2]);


			
			
		

		}
	}

}




//			//TreeSet -> 중복 제거 + 정렬
//			Set<Integer> set = new TreeSet<>();
//			for(int i = 0; i < N/4; i++) {
//
//			}
//
//
//
//
//
//			for(int i = 0; i < N; i++) {
//				//				bw.write("arr[i] = " + arr[i] + "\n");
//				//				bw.write("fisrt_cir[i] = " + first_cir[i] + "\n");
//				//				bw.write("second_cir[i] = " + second_cir[i] + "\n");
//				//				bw.write("third_cir[i] = " + third_cir[i] + "\n");
//				//				bw.write("result[i] : " + result[0] + "\n");
//			}
//			//			System.out.println(Integer.parseInt("1F7",16));
//			bw.flush();