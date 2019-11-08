import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 성수의프로그래밍강좌시청 {
	static int T;
    static int N;
    static int K;
    
    static int[] arr;
    
    static BufferedReader br;
    static BufferedWriter bw;
    
    static double A;
    public static void main(String[] args) throws NumberFormatException, IOException {//성수 프로그래밍
    	br = new BufferedReader(new InputStreamReader(System.in));
    	bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            
            A = 0;
            
            Arrays.sort(arr);
            
            //N-K => 정렬 후, 배열 값 중,,  큰 값 중에서 작은 값. (n개 중 큰 값에서 K개 만큼)
            for (int i = N-K; i < N; i++) {
                A = (A + arr[i])/2;
            }
            bw.write("#" + tc + " " + A);
            bw.write("\n");
            bw.flush();
        }
    }
    
}