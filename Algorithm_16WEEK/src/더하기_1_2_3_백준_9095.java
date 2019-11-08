import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 더하기_1_2_3_백준_9095 {

	static int T;
	static int N;
	
	static int[] arr;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			arr = new int[N+1];
			
			arr[1] = 1;
			if(N > 1) arr[2] = 2;
			if(N > 2) arr[3] = 4;
			
			for(int i = 4; i < arr.length; i++) {
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
//				bw.write("arr[i] : " + arr[i]);
			}
			
//			bw.write("T : " + T + "\n" + "N : " + N);
//			bw.write(dp[N]);
//			bw.write("\n");
//			bw.flush();
			System.out.println(arr[N]);
		}
	}

}
