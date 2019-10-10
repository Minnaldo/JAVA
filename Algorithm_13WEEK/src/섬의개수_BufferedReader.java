import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 섬의개수_BufferedReader {

	static int[][] arr = new int[52][52]; //바깥쪽을 바다로 만들기 위해서 배열 크기를 2칸 더 늘려줌.
	static int[] chk = new int[3000];
	static int Count = 0;
	
	static int width;
	static int height;
	
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	static boolean inArr(int x, int y) {
		return x > 0 && y > 0 && x < width && y < height;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int score = 0, cnt = 0, total_count = 0;


		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());

			if(width == 0 && height == 0)
				break;

			else {
				//0 으로 초기화 된 배열에 입력값을 넣어줌.
				for(int i = 1; i <= height; i++) {
					st = new StringTokenizer(br.readLine());
					for(int j = 1; j <= width; j++) {
						arr[i][j] = Integer.parseInt(st.nextToken());
					}
				}

				for(int i = 1; i <= height; i++) {
					for(int j = 1; j <= width; j++) {
						if(arr[i][j] == 1) {
							score = search(i, j);
							chk[cnt] = score;
							cnt++;
							total_count++;
							Count = 0;
						}
					}
				}


				bw.write(total_count + "");
				bw.write("\n");
				bw.flush();

				total_count = 0;
			}
		}
	}
	static int search(int i, int j) {
		if (arr[i][j] == 1)
			Count++;

		arr[i][j] = 0;

		if(arr[i][j+1] == 1) search(i, j+1);	//우
		if(arr[i+1][j+1]==1) search(i+1,j+1);	//우하
		if(arr[i-1][j+1]==1) search(i-1,j+1);	//좌하
		if(arr[i+1][j] == 1) search(i+1, j);	//하
		if(arr[i][j-1] == 1) search(i, j-1);	//좌
		if(arr[i+1][j-1]==1) search(i+1,j-1);	//우상
		if(arr[i-1][j-1]==1) search(i-1,j-1);	//좌상
		if(arr[i-1][j] == 1) search(i-1, j);	//상

		return Count;
	}
	
	

}
