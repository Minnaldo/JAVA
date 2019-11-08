import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 재관이의대량할인22_SWEA_4051 {

	static int T;
	static int N;
	static int[] arr;
	static int[] brr;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());

			int sum = 0;
			arr = new int[N];
			brr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				
			}

			Arrays.sort(arr);
			
			
			int idx=0;
			for(int i = N-1; i >= 0; i--) {
				brr[idx] = arr[i];
				idx++;
			}
			
			
			
			for(int i = N-1; i >= 0; i--) {
				if(i%3==2)
					continue;
				sum += brr[i];
			}
			
			
			bw.write("#" + tc + " " + sum);
			bw.write("\n");
			bw.flush();
		}
	}

}
