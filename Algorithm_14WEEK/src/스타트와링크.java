import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 스타트와링크 {

	
	
	static int N;
	static int[][] map;
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] arr = new int[N];
		int[] sel = new int[N/2];
		
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		
		int[] result = new int[N*N-N];
		
		int idx=0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(i != j) {
					result[idx] = map[i][j] + map[j][i];
//					bw.write("i : " + i + "  j : " + j + "   result["+idx+"] = " + result[idx] + "\n");
					idx++;
				}
			}
//			bw.write("\n");
		}
		
//		Arrays.sort(result);
//		
//		for(int i = 0; i < N*N-N; i++) {
//			bw.write("result["+i+"] = " + result[i] + " " + "\n");
//		}
		
		combi(arr, 0, 0, sel, new boolean[N]);
		
		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N; j++) {
//				bw.write(map[i][j] + " ");
//			}
//			bw.write("\n");
//		}
		
		bw.flush();
	}

	private static void combi(int[] arr, int n, int c, int[] sel, boolean[] visited) throws IOException {
		if(c == sel.length) {
			for(int i = 0; i < sel.length; i++) {
				bw.write(sel[i] + " ");
			}
			
			bw.write("\n");
			return;
		}
		if(n == arr.length)
			return;
		
//		sel[c] = arr[n];
		visited[n] = true;
		combi(arr, n+1, c+1, sel, visited);
		visited[n] = false;
		combi(arr, n+1, c, sel, visited);
		
	}
	

	

}
