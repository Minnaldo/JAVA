import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 나무재테크 {

	static int N;
	static int M;
	static int K;
	static int[][] map;
	static int[] x;
	static int[] y;
	static int[] z;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int[N][N];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		x = new int[M];
		y = new int[M];
		z = new int[M];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			z[i] = Integer.parseInt(st.nextToken());
		}

		


		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				bw.write(map[i][j] + " ");
			}
			bw.write("\n");
		}
		
		for(int i = 0; i < M; i++) {
			bw.write(x[i]+" ");
			bw.write(y[i]+" ");
			bw.write(z[i]+" ");
			bw.write("\n");
		}
		bw.flush();
	}

}
