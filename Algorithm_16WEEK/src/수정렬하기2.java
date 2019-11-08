import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 수정렬하기2 {

	static BufferedReader br;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2000002];
		for(int tc = 0; tc < N; tc++) {
			int num = Integer.parseInt(br.readLine());
			if(num > 0)
				arr[num+1000000] = true;
			else
				arr[num+1000000] = true;
		}
		
		
		for(int i = 0; i < 2000002; i++) {
			if(arr[i] == true) {
				bw.write(i-1000000+"\n");
//				System.out.println(i-1000000);
			}
		}
		
		bw.flush();
	}

}
