import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치함수 {

	static int T;
	static int N;

	static int[][] arr;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());

			arr = new int[41][2];

			arr[0][0] = 1;
			arr[1][1] = 1;
			for (int i = 2; i < arr.length; i++) {
				arr[i][0] = arr[i-1][0] + arr[i-2][0];
				arr[i][1] = arr[i-1][1] + arr[i-2][1];
			}


			System.out.println(arr[N][0]+" "+arr[N][1]);
		}

	}
}
